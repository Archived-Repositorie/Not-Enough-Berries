package com.github.justfoxxo.not_enough_berries
import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object Main: ModInitializer {
    val mod_id = "neb"
    override fun onInitialize() {
        for(i in 1..25) print("=")
        println("Initializing Not Enough Berries")
        println("InDev Version (Version created only for tests for developers not release)")
    }
}