/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.event;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

import java.util.ArrayList;
import java.util.UUID;

/**
 * makes it day if half the players are sleeping
 */
public class sleeping implements Listener {

	private ArrayList<UUID> sleepingplayers = new ArrayList<>();
	@EventHandler(ignoreCancelled = true)
	public void playersleep(PlayerBedEnterEvent event){
		Player player = event.getPlayer();
		sleepingplayers.add(player.getUniqueId());
		if(sleepingplayers.size()/2 > Bukkit.getOnlinePlayers().size()){
			Bukkit.broadcastMessage("enough player are sleeping making it day");
			player.getWorld().setTime(1000);

		} else {
			for(int i=0; i<sleepingplayers.size(); i++){
				UUID temp = sleepingplayers.get(i);
				Bukkit.getPlayer(temp).sendMessage((Bukkit.getOnlinePlayers().size()/2 -sleepingplayers.size()) +" players need to sleep ");

			}
		}


	}
	public void playerleavebed(PlayerBedLeaveEvent event){
		Player player = event.getPlayer();
		for(int i=0; i<sleepingplayers.size();i++){
			if(sleepingplayers.get(i) == player.getUniqueId()){
				sleepingplayers.remove(i);

			}
			if(sleepingplayers.size() >0){
				for(int l=0; l<sleepingplayers.size(); l++){
					UUID temp = sleepingplayers.get(l);
					Bukkit.getPlayer(temp).sendMessage((Bukkit.getOnlinePlayers().size()/2 -sleepingplayers.size()) +"players need to sleep ");

				}

			}
		}

	}


}
