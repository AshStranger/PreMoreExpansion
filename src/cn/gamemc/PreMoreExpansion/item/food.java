package cn.gamemc.PreMoreExpansion.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import cn.gamemc.PreMoreExpansion.build.loreBuff;
import cn.gamemc.PreMoreExpansion.main.configFood;

public class food {
	
	public static ItemStack food1 = new ItemStack(Material.APPLE);
	
	public static void allFood() {
	    ItemMeta food1Meta = food1.getItemMeta();
	    food1Meta.setDisplayName(configFood.foodYml.getString("food.food1.name").replaceAll("&", "¡ì"));
	    List<String> food1Lore = new ArrayList<String>();
	    food1Lore.add("¡ìa¡ìf¡ìf¡ìf¡ìc¡ìa¡ì1");
	    food1Lore.add(loreBuff.loreAttb());
	    food1Lore.add(loreBuff.loreAddFood(configFood.foodYml.getInt("food.food1.addFood")));
	    food1Lore.add(loreBuff.blank());
	    food1Meta.setLore(food1Lore);
	    food1.setItemMeta(food1Meta);
	    
	}
	
}
