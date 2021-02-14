/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Chicken;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.SkullMeta;
import org.main.evanserver;

import java.util.ArrayList;

public class evanhead implements Listener {
	private ItemStack evanskull = new ItemStack(Material.PLAYER_HEAD);
	private SkullMeta meta =  (SkullMeta) evanskull.getItemMeta();
	private NamespacedKey personSkullKey = new NamespacedKey(evanserver.getInstance(),"evanskull_key");
	@SuppressWarnings("deprecation")
	/**
	 * adds evans skull to the game
	 */
	public void Evanskull(){
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Evans's");
		meta.setLore(lore);
		meta.setOwner("evanmcgaming");


		evanskull.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(personSkullKey, evanskull);
		r.shape("%%%","%#%","%%%");
		r.setIngredient('#',Material.SUGAR);
		r.setIngredient('%', Material.DIAMOND);
		Bukkit.addRecipe(r);





	}
}
