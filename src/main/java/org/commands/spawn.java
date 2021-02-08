/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver)
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
	/**
	 * teleports the player to spawn
	 */
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
