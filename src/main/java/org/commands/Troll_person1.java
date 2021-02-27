/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Troll_person1 extends SimpleCommand {
	public Troll_person1() {
		super("Troll_Person1");
		setPermission(null);
		setCooldown(10, TimeUnit.MINUTES);
		setDescription("This command is used to troll person1");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		final Player player = getPlayer();
		if(!Bukkit.getPlayer("person1").isOnline()){

			player.sendMessage(ChatColor.GREEN + "Person1 is not currently online command failed");
			return;
		}
		Player person = Bukkit.getPlayer("person1");
		Random rn = new Random();
		 final int randomnumber = rn.nextInt(6);

		 switch (randomnumber){

			 case 0: {
			 	for(int i =0; i<5; i++){
			 	Bukkit.broadcastMessage("Person1 is a bot");}
			 }
				 break;
			 case 1: Bukkit.broadcastMessage("All hall Doughphantom9 person is a bot");

				 break;
			 case 2: {
				 if (Bukkit.getPlayer("dougphantom9") != null) {
					 person.teleport(Bukkit.getPlayer("dougphantom9").getLocation());}

				 person.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20*30, 19));
				 person.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 20*30, 19));
				 person.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 20*30, 1));
				 person.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20*30, 100));
				 person.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20*30, 2));
				 person.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 20*30, 10));
				 Bukkit.broadcastMessage(person.getName() + " has been cured thanks a lot " + player.getName());




				 }

				 break;
			 case 3: Bukkit.broadcastMessage("Potato is a stupid potato"); break;
			 case 4: {
			 	person.getLocation().getBlock().setType(Material.COBWEB);
			 	person.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20*30, 20));
			 	person.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 20*30, 20));
			 	person.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20*30, 100));
			 } break;

			 case 5:
				 Bukkit.broadcastMessage("to be make soon");
				 break;
			 default: Bukkit.broadcastMessage("This is the default case");
		 }


	}
}
