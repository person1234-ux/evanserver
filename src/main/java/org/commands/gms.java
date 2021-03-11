/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class gms extends SimpleCommand {
	public gms() {
		super("gms");
		setDescription("set the player gamemode to survival");
		setPermission("evanserver.gms");
		setPermissionMessage(ChatColor.RED + "I'm sorry but you don't have permission to run this command");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		if(player.getGameMode() != GameMode.SURVIVAL){
			player.sendMessage("your gamemode has been changed to survival");
			player.setGameMode(GameMode.SURVIVAL);
		} else{
			player.sendMessage("your already in survival");
		}

	}
}
