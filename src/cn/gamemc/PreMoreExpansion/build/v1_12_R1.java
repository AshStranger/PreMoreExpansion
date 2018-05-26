package cn.gamemc.PreMoreExpansion.build;


import org.bukkit.craftbukkit.v1_12_R1.inventory.CraftItemStack;

import cn.gamemc.PreMoreExpansion.item.arms;
import cn.gamemc.PreMoreExpansion.item.tools;
import cn.gamemc.PreMoreExpansion.main.configArms;
import net.minecraft.server.v1_12_R1.ItemStack;

public class v1_12_R1 {

	public static void arm1NMS() {
		ItemStack nmsStack = CraftItemStack.asNMSCopy(arms.arm1);
	    nmsStack.a("generic.attackDamage",new net.minecraft.server.v1_12_R1.AttributeModifier("attackDamage", configArms.armsYml.getInt("arms.arm1.damage")-1, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    nmsStack.a("generic.attackSpeed",new net.minecraft.server.v1_12_R1.AttributeModifier("attackSpeed", -2, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    arms.arm1 = CraftItemStack.asBukkitCopy(nmsStack);
	}
	
	public static void arm2NMS() {
		ItemStack nmsStack = CraftItemStack.asNMSCopy(arms.arm2);
	    nmsStack.a("generic.attackDamage",new net.minecraft.server.v1_12_R1.AttributeModifier("attackDamage", configArms.armsYml.getInt("arms.arm2.damage")-1, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    nmsStack.a("generic.attackSpeed",new net.minecraft.server.v1_12_R1.AttributeModifier("attackSpeed", -2, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    arms.arm2 = CraftItemStack.asBukkitCopy(nmsStack);
	}
	
	public static void arm3NMS() {
		ItemStack nmsStack = CraftItemStack.asNMSCopy(arms.arm3);
	    nmsStack.a("generic.attackDamage",new net.minecraft.server.v1_12_R1.AttributeModifier("attackDamage", configArms.armsYml.getInt("arms.arm3.damage")-1, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    nmsStack.a("generic.attackSpeed",new net.minecraft.server.v1_12_R1.AttributeModifier("attackSpeed", -2, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    arms.arm3 = CraftItemStack.asBukkitCopy(nmsStack);
	}
	
	public static void arm4NMS() {
		ItemStack nmsStack = CraftItemStack.asNMSCopy(arms.arm4);
	    nmsStack.a("generic.attackDamage",new net.minecraft.server.v1_12_R1.AttributeModifier("attackDamage", configArms.armsYml.getInt("arms.arm4.damage")-1, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    nmsStack.a("generic.attackSpeed",new net.minecraft.server.v1_12_R1.AttributeModifier("attackSpeed", -2, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    arms.arm4 = CraftItemStack.asBukkitCopy(nmsStack);
	}
	
	public static void arm5NMS() {
		ItemStack nmsStack = CraftItemStack.asNMSCopy(arms.arm5);
	    nmsStack.a("generic.attackDamage",new net.minecraft.server.v1_12_R1.AttributeModifier("attackDamage", configArms.armsYml.getInt("arms.arm5.damage")-1, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    nmsStack.a("generic.attackSpeed",new net.minecraft.server.v1_12_R1.AttributeModifier("attackSpeed", -3, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    arms.arm5 = CraftItemStack.asBukkitCopy(nmsStack);
	}
	
	public static void tool1NMS() {
		ItemStack nmsStack = CraftItemStack.asNMSCopy(tools.tool1);
	    nmsStack.a("generic.attackDamage",new net.minecraft.server.v1_12_R1.AttributeModifier("attackDamage", configArms.armsYml.getInt("arms.arm5.damage")-1, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    nmsStack.a("generic.attackSpeed",new net.minecraft.server.v1_12_R1.AttributeModifier("attackSpeed", -3, 0), net.minecraft.server.v1_12_R1.EnumItemSlot.MAINHAND);
	    tools.tool1 = CraftItemStack.asBukkitCopy(nmsStack);
	}

}
