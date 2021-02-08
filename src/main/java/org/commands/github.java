/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.concurrent.TimeUnit;


public class github extends SimpleCommand {
	public github() {
		super("github");
		setUsage("/github");
		setPermission(null);
		setName("github");
		setCooldown(20, TimeUnit.SECONDS);
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage("The github is https://github.com/person1234-ux/evanserver");

	}
}
