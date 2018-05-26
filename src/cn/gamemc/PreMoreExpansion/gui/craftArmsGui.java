package cn.gamemc.PreMoreExpansion.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class craftArmsGui {
	
	public static Inventory invGui;

	// 设置合成台武器Gui
	public static void openCraftArmsGui(Player player) {
		invGui = Bukkit.createInventory(player, 54, "§l合成台 §l武器");
		for ( int s=0; s<11; s++ ) {
			invGui.setItem(s, gui.gui1);
		}
		for ( int s=16; s<20; s++ ) {
			invGui.setItem(s, gui.gui1);
		}
		for ( int s=25; s<29; s++ ) {
			invGui.setItem(s, gui.gui1);
		}
		for ( int s=34; s<48; s++ ) {
			invGui.setItem(s, gui.gui1);
		}
		for ( int s=51; s<54; s++ ) {
			invGui.setItem(s, gui.gui1);
		}
		invGui.setItem(49, gui.gui3);
		invGui.setItem(48, gui.gui10);
		invGui.setItem(50, gui.gui11);
		invGui.setItem(11, gui.gui9);
		invGui.setItem(12, gui.gui12);
		invGui.setItem(13, gui.gui13);
		invGui.setItem(14, gui.gui14);
		invGui.setItem(15, gui.gui15);
		for ( int s=20; s<25; s++ ) {
			invGui.setItem(s, gui.gui8);
		}
		for ( int s=29; s<34; s++ ) {
			invGui.setItem(s, gui.gui8);
		}
	}

}
