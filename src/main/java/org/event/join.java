/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.mineacademy.fo.Common;

public class join implements Listener {
	@EventHandler
	public void potatojoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		event.setJoinMessage("");
		Common.tell(player, ChatColor.BLUE + "Welcome back " + player.getName());
		if (!player.hasPlayedBefore()){
			Bukkit.broadcastMessage(ChatColor.AQUA + "Everyone please welcome " + player.getName() + " to the server for the very first time");
		}

	}
}
