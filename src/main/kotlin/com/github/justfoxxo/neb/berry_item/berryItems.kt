package com.github.justfoxxo.neb.berry_item

import com.github.justfoxxo.neb.Main.mod_id
import com.github.justfoxxo.neb.berry_block.berryBlocks
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ItemGroup
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


class berryItems {
    private val testBerry = TestBerry(berryBlocks().testBerry, FabricItemSettings().group(ItemGroup.MATERIALS))

    fun load() {
        Registry.register(
            Registry.ITEM,
            Identifier(mod_id, "testberry"),
            testBerry
        )
        Items.SWEET_BERRIES
    }
}