package cn.gamemc.PreMoreExpansion.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import cn.gamemc.PreMoreExpansion.build.loreBuff;
import cn.gamemc.PreMoreExpansion.main.configBlocks;
import cn.gamemc.PreMoreExpansion.main.configTools;

public class tools {
	
	public static ItemStack tool1 = new ItemStack(Material.STONE_AXE);
	
	public static void tool() {
		ItemMeta tool1Meta = tool1.getItemMeta();
	    tool1Meta.setDisplayName(configTools.toolsYml.getString("tools.tool1.name").replaceAll("&", "¡ì"));
	    tool1Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> tool1Lore = new ArrayList<String>();
	    tool1Lore.add("¡ìa¡ìf¡ìf¡ìf¡ìe¡ìa¡ì1");
	    tool1Lore.add(loreBuff.loreAttb());
	    tool1Lore.add(loreBuff.loreAttack(configTools.toolsYml.getInt("tools.tool1.damage")));
	    tool1Lore.add(loreBuff.loreAttackSpeed("¡ìcÂý"));
	    tool1Lore.add("¡ìf");
	    tool1Lore.add(loreBuff.loreInfo());
	    tool1Lore.add("¡ìf       ¡ì7ÓÒ¼ü¿ÉÆÆ»µ "+configBlocks.blocksYml.getString("blocks.block1.name").replaceAll("&", "¡ì"));
	    tool1Lore.add(loreBuff.blank());
	    tool1Meta.setLore(tool1Lore);
	    tool1.setItemMeta(tool1Meta);
	}
	
}
