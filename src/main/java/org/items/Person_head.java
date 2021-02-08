/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver)
 */

package org.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.SkullMeta;
import org.main.evanserver;

import java.util.ArrayList;

public class Person_head implements Listener {
	private ItemStack person_skull = new ItemStack(Material.PLAYER_HEAD);
	private SkullMeta meta = (SkullMeta) person_skull.getItemMeta();
	private NamespacedKey person_skullkey = new NamespacedKey(evanserver.getInstance(), "personskull_key");

	/**
	 * adds person1 head to the game with a crafting recipe
	 */
	@SuppressWarnings("deprecation")
	public void personhead(){
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Person's skull");
		meta.setLore(lore);
		meta.setOwner("person1");
		person_skull.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(person_skullkey, person_skull);
		r.shape("!!!","!@!","!!!");
		r.setIngredient('!',Material.STONE);
		r.setIngredient('@',Material.CREEPER_HEAD);
		Bukkit.addRecipe(r);


	}
}
