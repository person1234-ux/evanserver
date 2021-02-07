/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.commands;

import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.List;

public class discord extends SimpleCommand {
	public discord() {
		super("discord");
		setPermission(null);
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage("The discord server is " +"https://discord.gg/mrVYEDpgW4");

	}
}
