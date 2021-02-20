/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.chat;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class blockplugincommand implements Listener {
	@EventHandler
	public void detectplugin(PlayerCommandPreprocessEvent event) {
		Player player = event.getPlayer();
		if(event.getMessage().equals("/plugins") || event.getMessage().equals("/pl") || event.getMessage().equals("/bukkit:pl") || event.getMessage().equals("/bukkit:plugins")){
			if (!player.hasPermission("evanserver.plugins")){
				event.setCancelled(true);
				if(player.hasPermission("evanserver.fake")){
					player.sendMessage(ChatColor.WHITE + "Plugins (1): "+ ChatColor.GREEN +"evanserver");
				}
			}



		}
	}


}
