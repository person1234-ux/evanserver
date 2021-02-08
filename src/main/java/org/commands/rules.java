/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class rules extends SimpleCommand {
	public rules() {
		super("rules");
		setPermission(null);
		setUsage("/rules");
		setName("rules");
		setCooldown(15, TimeUnit.SECONDS);

	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage(ChatColor.RED +"Rules to be released soon.");
		player.sendMessage("Please open a pull request on https://github.com/person1234-ux/evanserver/blob/master/src/main/java/org/commands/rules.java");

	}
}
