package com.github.justfoxxo.neb.berry_item

import net.minecraft.block.Block
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.AliasedBlockItem
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.world.World

class TestBerry(block: Block?, settings: Settings?) : AliasedBlockItem(block, settings) {
    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext?
    ) {
        super.appendTooltip(stack, world, tooltip, context)
        tooltip.add(TranslatableText("item.neb.testberry.tooltip"))
    }
    //val SWEET_BERRIES = Items.register("sweet_berries" as kotlin.String?, (AliasedBlockItem(Blocks.SWEET_BERRY_BUSH, (net.minecraft.item.Item.Settings()).group(ItemGroup.FOOD).food(FoodComponents.SWEET_BERRIES))) as net.minecraft.item.Item?)
}
