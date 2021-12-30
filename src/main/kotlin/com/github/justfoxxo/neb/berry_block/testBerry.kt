package com.github.justfoxxo.neb.berry_block

import net.minecraft.block.BlockState
import net.minecraft.block.Blocks
import net.minecraft.block.SweetBerryBushBlock
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView
import net.minecraft.world.World
import net.minecraft.world.WorldView

class TestBerry(settings: Settings?) : SweetBerryBushBlock(settings) {
    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos?,
        player: PlayerEntity,
        hand: Hand?,
        hit: BlockHitResult?
    ): ActionResult? {
        val i = state.get(AGE) as Int
        val bl = i == 3
        return if (!bl && player.getStackInHand(hand).isOf(Items.BONE_MEAL)) {
            ActionResult.PASS
        } else if (i > 1) {
            val j = 1 + world.random.nextInt(2)
            dropStack(world, pos, ItemStack(Items.DIAMOND, j + if (bl) 1 else 0))
            world.playSound(
                null as PlayerEntity?,
                pos,
                SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES,
                SoundCategory.BLOCKS,
                1.0f,
                0.8f + world.random.nextFloat() * 0.4f
            )
            world.setBlockState(pos, state.with(AGE, 1) as BlockState, 2)
            ActionResult.success(world.isClient)
        } else {
            super.onUse(state, world, pos, player, hand, hit)
        }
    }
    override fun getPickStack(world: BlockView?, pos: BlockPos?, state: BlockState?): ItemStack {
        return ItemStack(Items.DIAMOND)
    }

    override fun canPlaceAt(state: BlockState?, world: WorldView, pos: BlockPos): Boolean {
        return world.getBlockState(pos.down()).isOf(Blocks.DIAMOND_ORE)
    }

    override fun canPlantOnTop(floor: BlockState?, world: BlockView, pos: BlockPos): Boolean {
        return world.getBlockState(pos.down()).isOf(Blocks.DIAMOND_ORE)
    }
}
