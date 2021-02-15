/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.concurrent.TimeUnit;

public class lobby extends SimpleCommand {
	public lobby() {
		super("lobby");
		setPermission(null);
		setCooldown(1,TimeUnit.SECONDS);

	}

	/**
	 * Executed when the command is run. You can get the variables sender and args directly,
	 * and use convenience checks in the simple command class.
	 */
	@Override
	protected void onCommand() {
		if (!(sender instanceof Player)){
			System.out.println("This command can only be ran by the player!");

		}
		else
		{
			Player p = getPlayer();
			Location loc = new Location(Bukkit.getWorld("world"),0 , 50, 0);

			p.sendMessage(ChatColor.AQUA + p.getName() + " you have been teleported to lobby");
			p.teleport(loc);


		}

	}
}
