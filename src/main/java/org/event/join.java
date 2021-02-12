/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Particle;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.items.about_book;
import org.items.rules_book;
import org.main.evanserver;
import org.mineacademy.fo.Common;

public class join implements Listener {
	@EventHandler
	public void potatojoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		event.setJoinMessage("");
		Common.tell(player, ChatColor.BLUE + "Welcome back " + player.getName());


		player.getWorld().spawn(player.getLocation(), Firework.class);
		if (!player.hasPlayedBefore()){
			Bukkit.broadcastMessage(ChatColor.DARK_AQUA + "Everyone please welcome " + player.getName() + " to the server for the very first time");
			about_book books = new about_book();
			rules_book rulesBook = new rules_book();
			rulesBook.get_rules_book(player);
			player.sendMessage(ChatColor.RED +"Please read the rules.");
			player.sendMessage(ChatColor.RED +"Staff members get the final say on all punishments.");
			books.givebook(player);
			new BukkitRunnable() {
				/**
				 * When an object implementing interface <code>Runnable</code> is used
				 * to create a thread, starting the thread causes the object's
				 * <code>run</code> method to be called in that separately executing
				 * thread.
				 * <p>
				 * The general contract of the method <code>run</code> is that it may
				 * take any action whatsoever.
				 *
				 * @see Thread#run()
				 */
				@Override
				public void run() {
					for(int i = 0; i<30; i++){
						player.getWorld().spawn(player.getLocation(),Firework.class);

					}
				}
			}.runTaskLater(evanserver.getInstance(),20*5);
		}

	}
}
