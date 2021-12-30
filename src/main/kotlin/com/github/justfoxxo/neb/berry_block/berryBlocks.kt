package com.github.justfoxxo.neb.berry_block

import com.github.justfoxxo.neb.Main.mod_id
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.block.Blocks
import net.minecraft.client.render.RenderLayer
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class berryBlocks() {
    private val testBerry = TestBerry(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH))

    init {
        Registry.register(Registry.BLOCK, Identifier(mod_id, "testberry"), testBerry)
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), testBerry)
    }
}