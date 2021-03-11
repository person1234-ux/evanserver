/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.main.evanserver;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Dougphantom9 extends SimpleCommand {


	public Dougphantom9() {
		super("troll_dough");
		setCooldown(10,TimeUnit.MINUTES);
		setDescription("This command is used to troll dougphantom9. He might hate you after this though");
		setPermission(null);
	}

	@Override
	protected void onCommand() {
		if(Bukkit.getPlayer("DougPhantom9") == null){
			Player player = getPlayer();
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "you wasted it as DougPhantom9 isn't even online");
			return;
		}
		if(Bukkit.getPlayer("DougPhantom9").isOnline()){
			Player dough = Bukkit.getPlayer("DougPhantom9");
			Random rn = new Random();
			final int randomize = rn.nextInt(9);
			try{
			switch (randomize) {
					case 0:
						dough.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 5 * 60, 1, true));
						break;
					case 1: {
						ItemStack temp = dough.getInventory().getHelmet();
						ItemStack cursed = new ItemStack(Material.CARVED_PUMPKIN);
						ItemMeta meta = cursed.getItemMeta();
						ArrayList<String> lore = new ArrayList<>();
						lore.add("this item is cursed it will be removed in half a minute automatically");
						meta.setLore(lore);
						meta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
						cursed.setItemMeta(meta);
						dough.getInventory().setHelmet(cursed);
						System.out.println("dough trolled");
						Bukkit.broadcastMessage(dough.getName() + " has been given a pumpkin of biding");
						new BukkitRunnable() {
							@Override
							public void run() {
								dough.getInventory().setHelmet(temp);
								dough.sendMessage("curse has ended");
							}
						}.runTaskLater(evanserver.getInstance(), 20 * 30);

					}
					break;
					case 2: {
						dough.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20 * 30, 1));
						dough.getInventory().addItem(new ItemStack(Material.WATER_BUCKET));
						dough.sendMessage("you better be ready to catch yourself when you fall hopefully you don't lose your stuff");
						System.out.println("dough trolled");
						Bukkit.broadcastMessage(dough.getName() + " has been given levitation they better catch themselves with water");
					}
					break;
					case 3: {
						dough.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 30, 1));
						dough.sendMessage("enjoy your blindness");
						System.out.println("dough trolled");
						Bukkit.broadcastMessage(dough.getName() + " has been give blindness");
					}
					break;
					case 4: {
						dough.getLocation().getBlock().setType(Material.COBWEB);
						dough.setHealth(.5);
						dough.sendMessage("you better not take any damage or your going to have a rough time");

						Bukkit.broadcastMessage(dough.getName() + "heath has been set to half a hart");
					}
						 break;
					case 6: {
						dough.kickPlayer("you have been kicked as a troll at least you get piece and quiet for 10 minutes");
						Bukkit.broadcastMessage(dough.getName() + " has been kicked as part of the troll");
					} break;
				case 7: {
					double heaths = dough.getHealth();
					dough.setHealth(heaths/2);
					dough.sendMessage("half your health has been taken away");
					Bukkit.broadcastMessage("half of " +dough.getName() +"'s health has been taken away"); //
				} break;


					default:
						dough.sendMessage("you got lucky nothing is going to happen to you");
						Bukkit.broadcastMessage(dough.getName() + "got nothing");
				} }catch (NullPointerException e){
				e.printStackTrace();

			}
			
		} else{
			System.out.println("error");

		}

	}
}
