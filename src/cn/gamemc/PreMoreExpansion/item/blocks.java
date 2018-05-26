package cn.gamemc.PreMoreExpansion.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import cn.gamemc.PreMoreExpansion.build.loreBuff;
import cn.gamemc.PreMoreExpansion.main.configBlocks;

public class blocks {

	public static ItemStack block1 = new ItemStack(Material.STONE);
	
	public static void block() {
	    ItemMeta block1Meta = block1.getItemMeta();
	    block1Meta.setDisplayName(configBlocks.blocksYml.getString("blocks.block1.name").replaceAll("&", "§"));
	    List<String> block1Lore = new ArrayList<String>();
	    block1Lore.add("§a§f§f§f§d§a§1");
	    block1Lore.add("§7放在地面，右键它可以打开合成表");
	    block1Lore.add(loreBuff.blank());
	    block1Meta.setLore(block1Lore);
	    block1.setItemMeta(block1Meta);
	    
	}

}
