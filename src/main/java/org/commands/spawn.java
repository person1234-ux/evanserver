/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import com.bekvon.bukkit.residence.commands.set;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.concurrent.TimeUnit;

public class spawn extends SimpleCommand {
	public spawn() {
		super("spawn");
		setCooldown(1, TimeUnit.SECONDS);
		setPermission(null);
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		if (player.getWorld().getName().equals("spm")){
			Location loc = new Location(Bukkit.getWorld("spm"),-257 ,70 , 160);
			player.teleport(loc);
			player.sendMessage(ChatColor.AQUA + "you have been teleported to spawn");
		} else{
			player.sendMessage("you can't do the spawn command in that location");

		}


	}
}
