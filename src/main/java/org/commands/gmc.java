/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class gmc extends SimpleCommand {
	public gmc() {
		super("gmc");

		setDescription("Set the players gamemode to creative");
		setUsage("/gmc");
		setPermission("evanserver.gmc");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		if (player.getGameMode() != GameMode.CREATIVE){
			player.setGameMode(GameMode.CREATIVE);
			player.sendMessage(ChatColor.GREEN + "you gamemode has been changed to creative mode");
		} else {
			player.sendMessage("your already in creative mode");
		}


	}
}
