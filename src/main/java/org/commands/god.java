/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.main.evanserver;
import org.mineacademy.fo.command.SimpleCommand;

public class god extends SimpleCommand {
	public god() {
		super("god");
		setPermission("evanserver.god");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		if (player.getGameMode() != GameMode.SURVIVAL){
			player.sendMessage("the god command is only available in survival");
		} else{
			if(!player.isInvulnerable()){
				player.setInvulnerable(true);
				player.sendMessage("you have been put into god mode");
			} else{
				player.setInvulnerable(false);
				player.sendMessage("god mode has been disabled");
			}
		}

	}
}