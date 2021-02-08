/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.ArrayList;

public class rules extends SimpleCommand {
	public rules() {
		super("rules");
		setPermission(null);
		setUsage("/rules");
		setName("rules");

	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage(ChatColor.RED +"Rules to be released soon.");
		player.sendMessage("Please dm person on discord if you have any rule requests");

	}
}
