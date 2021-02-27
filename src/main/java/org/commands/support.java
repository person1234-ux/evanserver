/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class support extends SimpleCommand {
	public support() {
		super("support");
		setPermission(null);
		setDescription("command to get information about getting support for the smp");

	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage(ChatColor.GREEN+ "please email support-smp@evanmcgaming.xyz for help");

	}
}
