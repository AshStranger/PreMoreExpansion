package cn.gamemc.PreMoreExpansion.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import cn.gamemc.PreMoreExpansion.build.loreBuff;
import cn.gamemc.PreMoreExpansion.build.version;
import cn.gamemc.PreMoreExpansion.main.configArms;

public class arms {
	
  public static ItemStack arm1 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm2 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm3 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm4 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm5 = new ItemStack(Material.DIAMOND_SWORD);
  
  public static void arm() {
	  ItemMeta arm1Meta = arm1.getItemMeta();
	  arm1Meta.setDisplayName(configArms.armsYml.getString("arms.arm1.name").replaceAll("&", "§"));
	  arm1Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	  List<String> arm1Lore = new ArrayList<String>();
	  arm1Lore.add("§a§f§f§f§a§a§1");
	  arm1Lore.add(loreBuff.loreAttb());
	  arm1Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm1.damage")));
	  arm1Lore.add(loreBuff.loreAttackSpeed("§b中"));
	  arm1Lore.add(loreBuff.blank());
	  arm1Meta.setLore(arm1Lore);
	  arm1.setItemMeta(arm1Meta);
	  
	  ItemMeta arm2Meta = arm2.getItemMeta();
	  arm2Meta.setDisplayName(configArms.armsYml.getString("arms.arm2.name").replaceAll("&", "§"));
	  arm2Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	  List<String> arm2Lore = new ArrayList<String>();
	  arm2Lore.add("§a§f§f§f§a§a§2");
	  arm2Lore.add(loreBuff.loreAttb());
	  arm2Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm2.damage")));
	  arm2Lore.add(loreBuff.loreAttackSpeed("§b中"));
	  arm2Lore.add(loreBuff.blank());
	  arm2Meta.setLore(arm2Lore);
	  arm2.setItemMeta(arm2Meta);
	  
	  ItemMeta arm3Meta = arm3.getItemMeta();
	  arm3Meta.setDisplayName(configArms.armsYml.getString("arms.arm3.name").replaceAll("&", "§"));
	  arm3Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	  List<String> arm3Lore = new ArrayList<String>();
	  arm3Lore.add("§a§f§f§f§a§a§3");
	  arm3Lore.add(loreBuff.loreAttb());
	  arm3Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm3.damage")));
	  arm3Lore.add(loreBuff.loreAttackSpeed("§b中"));
	  arm3Lore.add(loreBuff.blank());
	  arm3Meta.setLore(arm3Lore);
	  arm3.setItemMeta(arm3Meta);
	  
	  ItemMeta arm4Meta = arm4.getItemMeta();
	  arm4Meta.setDisplayName(configArms.armsYml.getString("arms.arm4.name").replaceAll("&", "§"));
	  arm4Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	  List<String> arm4Lore = new ArrayList<String>();
	  arm4Lore.add("§a§f§f§f§a§a§4");
	  arm4Lore.add(loreBuff.loreAttb());
	  arm4Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm4.damage")));
	  arm4Lore.add(loreBuff.loreAttackSpeed("§b中"));
	  arm4Lore.add(loreBuff.blank());
	  arm4Meta.setLore(arm4Lore);
	  arm4.setItemMeta(arm4Meta);
	  
	  ItemMeta arm5Meta = arm5.getItemMeta();
	  arm5Meta.setDisplayName(configArms.armsYml.getString("arms.arm5.name").replaceAll("&", "§"));
	  arm5Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	  List<String> arm5Lore = new ArrayList<String>();
	  arm5Lore.add("§a§f§f§f§a§a§5");
	  arm5Lore.add(loreBuff.loreAttb());
	  arm5Lore.add(loreBuff.loreAttack(configArms.armsYml.getInt("arms.arm5.damage")));
	  arm5Lore.add(loreBuff.loreAttackSpeed("§c慢"));
	  arm5Lore.add("§f");
	  arm5Lore.add(loreBuff.loreSkill());
	  arm5Lore.add("§f       §7§l[§f§l-§7§l]§f §f§l一点星移§f");
	  arm5Lore.add("§f       §7§l[§f§l §7§l]§f §7法术伤害 §f"+configArms.armsYml.getInt("arms.arm5.spellsDamage"));
	  arm5Lore.add("§f       §7§l[§f§l §7§l]§f §7触发条件 §f右键");
	  arm5Lore.add("§f       §7§l[§f§l §7§l]§f §7冷却时间 §f"+configArms.armsYml.getInt("arms.arm5.spellsTime")+"秒");
	  arm5Lore.add("§f       §7§l[§f§l §7§l]§f §7技能信息 §8发射"+configArms.armsYml.getInt("arms.arm5.spellsFar")+"格距离线粒，");
	  arm5Lore.add("§8           命中实体则造成其受到伤害并");
	  arm5Lore.add("§8           爆出烟花特效");
	  arm5Lore.add(loreBuff.blank());
      arm5Meta.setLore(arm5Lore);
      arm5.setItemMeta(arm5Meta);
	  
	  // NBT
	  version.nmsItem();
  }
  
}
