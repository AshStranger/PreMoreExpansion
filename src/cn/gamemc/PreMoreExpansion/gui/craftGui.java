package cn.gamemc.PreMoreExpansion.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class craftGui {
	
	public static Inventory invGui;

	// 设置合成台选择分类Gui
	public static void openCraftGui(Player player) {
		invGui = Bukkit.createInventory(player, 54, "§l合成台 §l分类选择");
		for ( int s=0; s<20; s++ ) {
			invGui.setItem(s, gui.gui1);
		}
		invGui.setItem(20, gui.gui4);
		invGui.setItem(21, gui.gui5);
		invGui.setItem(22, gui.gui6);
		invGui.setItem(23, gui.gui7);
		invGui.setItem(24, gui.gui8);
		for ( int s=25; s<49; s++ ) {
			invGui.setItem(s, gui.gui1);
		}
		for ( int s=50; s<54; s++ ) {
			invGui.setItem(s, gui.gui1);
		}
		invGui.setItem(49, gui.gui3);
	}

}
