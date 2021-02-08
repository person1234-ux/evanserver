/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.items;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.main.evanserver;

import java.util.ArrayList;

public class Super_Potato implements Listener {

	private ItemStack item = new ItemStack(Material.POTATO);
	private ItemMeta meta = item.getItemMeta();
	private NamespacedKey itemkey = new NamespacedKey(evanserver.getInstance(), "item_key");


	/**
	 * this creates a ceustom potato which increases the players speed along with has knockback.
	 * The potato also has curse of vanishing
	 *
	 */
	public void potatositem() {
		ArrayList<String> lore = new ArrayList<>();
		lore.add("I don't need to walk");
		lore.add("who loves the speed");
		meta.setLore(lore);
		meta.setDisplayName("Super evanserver");
		meta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("GENERIC_SPEED", .5f, AttributeModifier.Operation.ADD_NUMBER));
		meta.addEnchant(Enchantment.KNOCKBACK, 5, true);
		meta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		item.setItemMeta(meta);

		@SuppressWarnings("")
		ShapedRecipe s = new ShapedRecipe(itemkey, item);
		s.shape("&&&","&#&","&&&");
		s.setIngredient('#', Material.POTATO);
		s.setIngredient('&', Material.GOLD_BLOCK);
		Bukkit.addRecipe(s);

	}
	}


