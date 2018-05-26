package cn.gamemc.PreMoreExpansion.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import cn.gamemc.PreMoreExpansion.build.loreBuff;
import cn.gamemc.PreMoreExpansion.main.configArms;
import cn.gamemc.PreMoreExpansion.main.configBlocks;
import cn.gamemc.PreMoreExpansion.main.configFood;
import cn.gamemc.PreMoreExpansion.main.configTools;

public class gui {
	
	// item
	// 灰色按钮
	public static ItemStack gui1 = new ItemStack(Material.STAINED_GLASS_PANE);
	// 绿色对按钮
	public static ItemStack gui2 = new ItemStack(Material.SLIME_BALL);
	// 红色错按钮
	public static ItemStack gui3 = new ItemStack(Material.MAGMA_CREAM);
	// 武器类按钮
	public static ItemStack gui4 = new ItemStack(Material.DIAMOND_SWORD);
	// 工具类按钮
	public static ItemStack gui5 = new ItemStack(Material.STONE_AXE);
	// 食物类按钮
	public static ItemStack gui6 = new ItemStack(Material.APPLE);
	// 方块类按钮
	public static ItemStack gui7 = new ItemStack(Material.STONE);
	// 屏障
	public static ItemStack gui8 = new ItemStack(Material.BARRIER);
	// arm1
	public static ItemStack gui9 = new ItemStack(Material.DIAMOND_SWORD);
	// 绿色上一页
	public static ItemStack gui10 = new ItemStack(Material.SLIME_BALL);
	// 绿色下一页
	public static ItemStack gui11 = new ItemStack(Material.SLIME_BALL);
	// arm2
	public static ItemStack gui12 = new ItemStack(Material.DIAMOND_SWORD);
	// arm3
	public static ItemStack gui13 = new ItemStack(Material.DIAMOND_SWORD);
	// arm4
	public static ItemStack gui14 = new ItemStack(Material.DIAMOND_SWORD);
	// arm5
	public static ItemStack gui15 = new ItemStack(Material.DIAMOND_SWORD);
	// tool1
	public static ItemStack gui16 = new ItemStack(Material.STONE_AXE);
	// food1
	public static ItemStack gui17 = new ItemStack(Material.APPLE);
	// block1
	public static ItemStack gui18 = new ItemStack(Material.STONE);
	
	// 设置item
	public static void allGui() {
		gui1.setDurability((short) 7);
	    ItemMeta gui1Meta = gui1.getItemMeta();
	    gui1Meta.setDisplayName("§a§f§f§f§f§a§1");
	    gui1.setItemMeta(gui1Meta);
	    
	    ItemMeta gui3Meta = gui3.getItemMeta();
	    gui3Meta.setDisplayName("§7§l[§c§l点击关闭§7§l]");
	    gui3.setItemMeta(gui3Meta);
	    
	    ItemMeta gui4Meta = gui4.getItemMeta();
	    gui4Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    gui4Meta.setDisplayName(loreBuff.blank());
	    List<String> gui4Lore = new ArrayList<String>();
	    gui4Lore.add("§f               §6§l武器合成");
	    gui4Lore.add("§f                 §7§l[§a§l点击§7§l]");
	    gui4Lore.add("§a§f§f§f§a§a§1");
	    gui4Meta.setLore(gui4Lore);
	    gui4.setItemMeta(gui4Meta);
	    
	    ItemMeta gui5Meta = gui5.getItemMeta();
	    gui5Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    gui5Meta.setDisplayName(loreBuff.blank());
	    List<String> gui5Lore = new ArrayList<String>();
	    gui5Lore.add("§f               §6§l工具合成");
	    gui5Lore.add("§f                 §7§l[§a§l点击§7§l]");
	    gui5Lore.add("§a§f§f§f§e§a§1");
	    gui5Meta.setLore(gui5Lore);
	    gui5.setItemMeta(gui5Meta);
	    
	    ItemMeta gui6Meta = gui6.getItemMeta();
	    gui6Meta.setDisplayName(loreBuff.blank());
	    List<String> gui6Lore = new ArrayList<String>();
	    gui6Lore.add("§f               §6§l食物合成");
	    gui6Lore.add("§f                 §7§l[§a§l点击§7§l]");
	    gui6Lore.add("§a§f§f§f§e§a§1");
	    gui6Meta.setLore(gui6Lore);
	    gui6.setItemMeta(gui6Meta);
	    
	    ItemMeta gui7Meta = gui7.getItemMeta();
	    gui7Meta.setDisplayName(loreBuff.blank());
	    List<String> gui7Lore = new ArrayList<String>();
	    gui7Lore.add("§f               §6§l方块合成");
	    gui7Lore.add("§f                 §7§l[§a§l点击§7§l]");
	    gui7Lore.add("§a§f§f§f§d§a§1");
	    gui7Meta.setLore(gui7Lore);
	    gui7.setItemMeta(gui7Meta);
	    
	    ItemMeta gui8Meta = gui8.getItemMeta();
	    gui8Meta.setDisplayName(loreBuff.blank());
	    List<String> gui8Lore = new ArrayList<String>();
	    gui8Lore.add("§f               §c§l敬请期待");
	    gui8Lore.add("§f");
	    gui8Meta.setLore(gui8Lore);
	    gui8.setItemMeta(gui8Meta);
	    
	    ItemMeta gui9Meta = gui9.getItemMeta();
	    gui9Meta.setDisplayName(configArms.armsYml.getString("arms.arm1.name").replaceAll("&", "§"));
	    gui9Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> gui9Lore = new ArrayList<String>();
	    gui9Lore.add("§a§f§f§f§a§a§1");
	    gui9Lore.add(loreBuff.loreAttb());
	    gui9Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm1.damage")));
	    gui9Lore.add(loreBuff.blank());
	    gui9Lore.add("§7§l[§a§l左键合成§7§l]");
	    gui9Lore.add("§f 获得 §7X1");
	    gui9Lore.add("§f 需要");
	    gui9Lore.add("§7    - 蓝色染色玻璃块 x6");
	    gui9Lore.add("§7    - 木棍 x3");
	    gui9Meta.setLore(gui9Lore);
	    gui9.setItemMeta(gui9Meta);
	    
	    ItemMeta gui10Meta = gui10.getItemMeta();
	    gui10Meta.setDisplayName("§7§l[§a§l上一页§7§l]");
	    gui10.setItemMeta(gui10Meta);
	    
	    ItemMeta gui11Meta = gui11.getItemMeta();
	    gui11Meta.setDisplayName("§7§l[§a§l下一页§7§l]");
	    gui11.setItemMeta(gui11Meta);
	    
	    ItemMeta gui12Meta = gui12.getItemMeta();
	    gui12Meta.setDisplayName(configArms.armsYml.getString("arms.arm2.name").replaceAll("&", "§"));
	    gui12Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> gui12Lore = new ArrayList<String>();
	    gui12Lore.add("§a§f§f§f§a§a§2");
	    gui12Lore.add(loreBuff.loreAttb());
	    gui12Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm2.damage")));
	    gui12Lore.add(loreBuff.blank());
	    gui12Lore.add("§7§l[§a§l左键合成§7§l]");
	    gui12Lore.add("§f 获得 §7X1");
	    gui12Lore.add("§f 需要");
	    gui12Lore.add("§7    - 红色玻璃块 x6");
	    gui12Lore.add("§7    - 木棍 x3");
	    gui12Meta.setLore(gui12Lore);
	    gui12.setItemMeta(gui12Meta);
	    
	    ItemMeta gui13Meta = gui13.getItemMeta();
	    gui13Meta.setDisplayName(configArms.armsYml.getString("arms.arm3.name").replaceAll("&", "§"));
	    gui13Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> gui13Lore = new ArrayList<String>();
	    gui13Lore.add("§a§f§f§f§a§a§3");
	    gui13Lore.add(loreBuff.loreAttb());
	    gui13Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm3.damage")));
	    gui13Lore.add(loreBuff.blank());
	    gui13Lore.add("§7§l[§a§l左键合成§7§l]");
	    gui13Lore.add("§f 获得 §7X1");
	    gui13Lore.add("§f 需要");
	    gui13Lore.add("§7    - 绿色玻璃块 x6");
	    gui13Lore.add("§7    - 木棍 x3");
	    gui13Meta.setLore(gui13Lore);
	    gui13.setItemMeta(gui13Meta);
	    
	    ItemMeta gui14Meta = gui14.getItemMeta();
	    gui14Meta.setDisplayName(configArms.armsYml.getString("arms.arm4.name").replaceAll("&", "§"));
	    gui14Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> gui14Lore = new ArrayList<String>();
	    gui14Lore.add("§a§f§f§f§a§a§4");
	    gui14Lore.add(loreBuff.loreAttb());
	    gui14Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm4.damage")));
	    gui14Lore.add(loreBuff.blank());
	    gui14Lore.add("§7§l[§a§l左键合成§7§l]");
	    gui14Lore.add("§f 获得 §7X1");
	    gui14Lore.add("§f 需要");
	    gui14Lore.add("§7    - 黄色玻璃块 x6");
	    gui14Lore.add("§7    - 木棍 x3");
	    gui14Meta.setLore(gui14Lore);
	    gui14.setItemMeta(gui14Meta);
	    
	    ItemMeta gui15Meta = gui15.getItemMeta();
	    gui15Meta.setDisplayName(configArms.armsYml.getString("arms.arm5.name").replaceAll("&", "§"));
	    gui15Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> gui15Lore = new ArrayList<String>();
	    gui15Lore.add("§a§f§f§f§a§a§5");
	    gui15Lore.add(loreBuff.loreAttb());
	    gui15Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm5.damage")));
	    gui15Lore.add(loreBuff.blank());
	    gui15Lore.add("§7§l[§a§l左键合成§7§l]");
	    gui15Lore.add("§f 获得 §7X1");
	    gui15Lore.add("§f 需要");
	    gui15Lore.add("§7    - 金锭 x2");
	    gui15Lore.add("§7    - 铁锭 x6");
	    gui15Lore.add("§7    - 木棍 x3");
	    gui15Meta.setLore(gui15Lore);
	    gui15.setItemMeta(gui15Meta);
	    
	    ItemMeta gui16Meta = gui16.getItemMeta();
	    gui16Meta.setDisplayName(configTools.toolsYml.getString("tools.tool1.name").replaceAll("&", "§"));
	    gui16Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> gui16Lore = new ArrayList<String>();
	    gui16Lore.add("§a§f§f§f§e§a§1");
	    gui16Lore.add(loreBuff.loreAttb());
	    gui16Lore.add(loreBuff.loreAttack(configTools.toolsYml.getInt("tools.tool1.damage")));
	    gui16Lore.add(loreBuff.loreInfo());
	    gui16Lore.add("§f       §7右键可破坏 "+configTools.toolsYml.getString("tools.tool1.name").replaceAll("&", "§"));
	    gui16Lore.add(loreBuff.blank());
	    gui16Lore.add("§7§l[§a§l左键合成§7§l]");
	    gui16Lore.add("§f 获得 §7X1");
	    gui16Lore.add("§f 需要");
	    gui16Lore.add("§7    - 木棍  x3");
	    gui16Lore.add("§7    - 石头  x6");
	    gui16Meta.setLore(gui16Lore);
	    gui16.setItemMeta(gui16Meta);
	    
	    ItemMeta gui17Meta = gui17.getItemMeta();
	    gui17Meta.setDisplayName(configFood.foodYml.getString("food.food1.name").replaceAll("&", "§"));
	    List<String> gui17Lore = new ArrayList<String>();
	    gui17Lore.add("§a§f§f§f§c§a§1");
	    gui17Lore.add(loreBuff.loreAttb());
	    gui17Lore.add(loreBuff.loreAddFood(configFood.foodYml.getInt("food.food1.addFood")));
	    gui17Lore.add(loreBuff.blank());
	    gui17Lore.add("§7§l[§a§l左键合成§7§l]");
	    gui17Lore.add("§f 获得 §7X1");
	    gui17Lore.add("§f 需要");
	    gui17Lore.add("§7    - 苹果 x1");
	    gui17Lore.add("§7    - 黄绿色染料 x1");
	    gui17Lore.add("§f");
	    gui17Lore.add("§7§l[§a§l右键合成§7§l]");
	    gui17Lore.add("§f 获得 §7X64");
	    gui17Lore.add("§f 需要");
	    gui17Lore.add("§7    - 苹果 x64");
	    gui17Lore.add("§7    - 黄绿色染料 x64");
	    gui17Meta.setLore(gui17Lore);
	    gui17.setItemMeta(gui17Meta);
	    
	    ItemMeta gui18Meta = gui18.getItemMeta();
	    gui18Meta.setDisplayName(configBlocks.blocksYml.getString("blocks.block1.name").replaceAll("&", "§"));
	    List<String> gui18Lore = new ArrayList<String>();
	    gui18Lore.add("§a§f§f§f§d§a§1");
	    gui18Lore.add("§7放在地面，右键它可以打开合成表");
	    gui18Lore.add(loreBuff.blank());
	    gui18Lore.add("§7§l[§a§l左键合成§7§l]");
	    gui18Lore.add("§f 获得 §7X1");
	    gui18Lore.add("§f 需要");
	    gui18Lore.add("§7    - 工作台 x1");
	    gui18Meta.setLore(gui18Lore);
	    gui18.setItemMeta(gui18Meta);
	    
	    /*
	    gui.setDurability((short) 7);
	    ItemMeta guiMeta = gui.getItemMeta();
	    guiMeta.setDisplayName("§a§f§f§f§f§a§");
	    gui.setItemMeta(guiMeta);
	     */
	}

}
