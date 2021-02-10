/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;
import org.items.about_book;

import java.util.concurrent.TimeUnit;

public class about extends SimpleCommand {


	public about() {
		super("about");
		setPermission(null);
		setCooldown(1, TimeUnit.MINUTES);
	}

	@Override
	protected void onCommand() {
		if (sender instanceof Player){
		about_book o = new about_book();
			Player player = getPlayer();
			player.sendMessage(ChatColor.AQUA +"This server is the unofficial evanmcgaming server");
			player.sendMessage(ChatColor.AQUA+ "The server recipes will be releases soon");
			player.sendMessage("This server is hosted by HighHosting do /host for more information");
			o.givebook(player);





		} else {
			System.out.println("This command can only be used by the player.");
		}

	}
}
