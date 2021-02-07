/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.List;

public class discord extends SimpleCommand {
	/**
	 * give the player the discord server
	 */
	public discord() {
		super("discord");
		setPermission(null);
	}

	@Override
	protected void onCommand() {
		if (sender instanceof Player){

			Player player = getPlayer();
			player.sendMessage("The discord server is " + ChatColor.DARK_BLUE +"https://discord.gg/mrVYEDpgW4");
		}
		else {
			System.out.println("The discord server is https://discord.gg/mrVYEDpgW4");
		}

	}
}
