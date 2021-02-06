
package org.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.main.evanserver;

import java.util.ArrayList;

public class God_Potato implements Listener {

	private ItemStack god = new ItemStack(Material.POTATO);
   private ItemMeta meta = god.getItemMeta();
private NamespacedKey godkey = new NamespacedKey(evanserver.getInstance(),"god_key");



	/**
	 * creates a god potato
	 */
   public void goditem(){

   ArrayList<String> lore = new ArrayList<>();
   lore.add("EAT ME");
   meta.setLore(lore);
   meta.setDisplayName("GOD_POTATO");
   meta.setLocalizedName("GOD_POTATO");
   meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
   god.setItemMeta(meta);

	   @SuppressWarnings("")
	   ShapedRecipe r = new ShapedRecipe(godkey, god);
	   r.shape("###","#$#","###");
	   r.setIngredient('#', Material.NETHERITE_BLOCK);
	   r.setIngredient('$', Material.POTATO);
	   Bukkit.addRecipe(r);


   }





}

