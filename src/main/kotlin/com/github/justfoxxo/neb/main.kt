package com.github.justfoxxo.neb
import com.github.justfoxxo.neb.berry_block.berryBlocks
import com.github.justfoxxo.neb.berry_item.berryItems
import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object Main: ModInitializer {
    val mod_id = "neb"
    override fun onInitialize() {
        println("Initializing Not Enough Berries")
        println("InDev Version (Version created only for tests for developers not release)")
        berryBlocks().load()
        println("Berry Bushes have been loaded")
        berryItems().load()
    }
}