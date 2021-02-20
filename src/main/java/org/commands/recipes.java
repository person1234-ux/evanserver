/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class recipes extends SimpleCommand {
	public recipes() {
		super("recipes");
		setPermission(null);
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage("Here is a link to some of the recipes not all of them have been released yet");

	}
}
