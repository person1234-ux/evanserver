/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.items.about_book;
import org.mineacademy.fo.Common;

public class join implements Listener {
	@EventHandler
	public void potatojoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		event.setJoinMessage("");
		Common.tell(player, ChatColor.BLUE + "Welcome back " + player.getName());
		if (!player.hasPlayedBefore()){
			Bukkit.broadcastMessage(ChatColor.AQUA + "Everyone please welcome " + player.getName() + " to the server for the very first time");
			about_book books = new about_book();
			books.givebook(player);
		}

	}
}
