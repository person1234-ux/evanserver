/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.commands;

import com.bekvon.bukkit.residence.commands.set;
import com.massivecraft.factions.FLocation;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.concurrent.TimeUnit;

public class spawn extends SimpleCommand {
	public spawn() {
		super("spawn");
		setDescription("Teleports the player to spawn");
		setPermission(null);
		setCooldown(30, TimeUnit.SECONDS);
	}

	@Override
	protected void onCommand() {
		if (!(sender instanceof Player)){
			System.out.println("This command can only be ran by the player!");

		}
		else
		{
			Player p = getPlayer();
			Location loc = new Location(Bukkit.getWorld("world"), 382, 77, 48.5f); //todo update the spawn cords
			if(p.getWorld().getName().equals("world")){
				p.teleport(loc);
				p.sendMessage(ChatColor.AQUA + p.getName() + " you have been teleported to spawn");
			} else {
				p.sendMessage(ChatColor.RED +"You are in the wrong world to do that command");
			}

		}

	}
}
