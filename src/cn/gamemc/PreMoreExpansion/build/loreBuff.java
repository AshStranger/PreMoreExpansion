package cn.gamemc.PreMoreExpansion.build;

public class loreBuff {
	
	  public static String blank() {
		  String blank = "§f                                        ";
		  return blank;
	  }
	  
	  public static String loreAttb() {
		  String loreAttb = "§f §3§l属性 §f§l>";
		  return loreAttb;
	  }
	  
	  public static String loreInfo() {
		  String loreInfo = "§f §3§l信息 §f§l>";
		  return loreInfo;
	  }
	  
	  public static String loreSkill() {
		  String loreInfo = "§f §3§l技能 §f§l>";
		  return loreInfo;
	  }
	  
	  public static String loreAttack(int damage) {
		    String loreAttack = "§f       §7§l[§f§l-§7§l]§f §7攻击伤害 §f" + damage;
		    return loreAttack;
	  }
	  
	  public static String loreSpellsDamage(int damage) {
		    String loreSpellsDamage = "§f       §7§l[§f§l-§7§l]§f §7法术伤害 §f" + damage;
		    return loreSpellsDamage;
	  }
	  
	  public static String loreAddFood(int addFood) {
		    String loreAddFood = "§f       §7§l[§f§l-§7§l]§f §7饱食增值 §f" + addFood;
		    return loreAddFood;
	  }
	  
	  public static String loreAttackSpeed(String speed) {
		    String loreAddFood = "§f       §7§l[§f§l-§7§l]§f §7攻击速度 §f" + speed;
		    return loreAddFood;
	  }
	  
}
