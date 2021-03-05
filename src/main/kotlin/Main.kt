package dev.mee42

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Boat
import org.bukkit.entity.Minecart
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin


class SpedPlugin: JavaPlugin() {
    override fun onEnable() {
        super.onEnable()

        val x: Command = object: Command("sped", "change the max speed of your minecart","/sped 0.4",java.util.Collections.singletonList("s")) {
            override fun execute(sender: CommandSender, commandLabel: String, args: Array<out String>): Boolean {
                sender as Player
                sender.vehicle?.let { vechicle ->
                    if(vechicle is Minecart) {
                        vechicle.maxSpeed = args.firstOrNull()?.toDoubleOrNull() ?: 0.4
                        println("set speed to ${vechicle.maxSpeed}")
                    }

                }
                
                return truelength
            }
        }

        this.server.commandMap.register("sped",x)
    }
}
