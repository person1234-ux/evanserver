/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class sponsor extends SimpleCommand {
	public sponsor() {
		super("sponsor");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage("if you want to help sponsor the discord server please email person@random101.net");
	}
}
