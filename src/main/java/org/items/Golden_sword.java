/*
 * Copyright (c) 2021. This is open source and provided by person
 */

package org.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.main.evanserver;

import java.util.ArrayList;

public class Golden_sword implements Listener {
	private ItemStack golden_looting_sword = new ItemStack(Material.GOLDEN_SWORD);
	private ItemMeta meta = golden_looting_sword.getItemMeta();
	private NamespacedKey golden_looting_swordkey = new NamespacedKey(evanserver.getInstance(), "golden_looting_swork_key");


	/**
	 * adds a golden sword that has enchantment level 30 to the game.
	 */
	public void customgoldensword(){
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Gives a lot but breaks easily"); //todo come up with a better name for the sword.
		meta.setLore(lore);
		meta.setDisplayName("Gold that breaks");
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 100,true);
		golden_looting_sword.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(golden_looting_swordkey, golden_looting_sword);
		r.shape("I&r","*%@","#!m");
		r.setIngredient('#',Material.GOLD_BLOCK);
		r.setIngredient('!',Material.NETHERITE_BLOCK);
		r.setIngredient('&',Material.DIAMOND_BLOCK);
		r.setIngredient('%',Material.GOLDEN_SWORD);
		r.setIngredient('@',Material.EMERALD_BLOCK);
		r.setIngredient('I',Material.IRON_BLOCK);
		r.setIngredient('*',Material.LAPIS_BLOCK);
		r.setIngredient('r',Material.REDSTONE_BLOCK);
		r.setIngredient('m',Material.MAGMA_BLOCK);

		Bukkit.addRecipe(r);
	}
}
