/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;
import org.items.about_book;

public class about extends SimpleCommand {


	public about() {
		super("about");
		setPermission(null);
	}

	@Override
	protected void onCommand() {
		if (sender instanceof Player){
		about_book o = new about_book();
			Player player = getPlayer();
			player.sendMessage(ChatColor.AQUA +"This server is the unofficial evanmcgaming server");
			player.sendMessage(ChatColor.AQUA+ "The server recipes will be releases soon");
			o.givebook(player);





		} else {
			System.out.println("This command can only be used by the player.");
		}

	}
}
