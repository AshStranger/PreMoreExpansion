package cn.gamemc.PreMoreExpansion.event;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import cn.gamemc.PreMoreExpansion.gui.craftArmsGui;
import cn.gamemc.PreMoreExpansion.gui.craftBlocksGui;
import cn.gamemc.PreMoreExpansion.gui.craftFoodGui;
import cn.gamemc.PreMoreExpansion.gui.craftGui;
import cn.gamemc.PreMoreExpansion.gui.craftToolsGui;

public class clickGui implements Listener {
	
	@EventHandler
	public void onClickInv(InventoryClickEvent e) {
		// 判断Gui
		if ( e.getInventory().getTitle().equals("§l合成台 §l分类选择") ) {
			// 不能修改Gui
			e.setCancelled(true);
			// 关闭
			if ( e.getRawSlot()==49 ) {
				e.getWhoClicked().closeInventory();
			}
			// 打开武器合成
			if ( e.getRawSlot()==20 ) {
				craftArmsGui.openCraftArmsGui((Player) e.getWhoClicked());
				e.getWhoClicked().openInventory(craftArmsGui.invGui);
			}
			// 打开工具合成
			if ( e.getRawSlot()==21 ) {
				craftToolsGui.openCraftArmsGui((Player) e.getWhoClicked());
				e.getWhoClicked().openInventory(craftToolsGui.invGui);
			}
			// 打开食物合成
			if ( e.getRawSlot()==22 ) {
				craftFoodGui.openCraftArmsGui((Player) e.getWhoClicked());
				e.getWhoClicked().openInventory(craftFoodGui.invGui);
			}
			// 打开方块合成
			if ( e.getRawSlot()==23 ) {
				craftBlocksGui.openCraftArmsGui((Player) e.getWhoClicked());
				e.getWhoClicked().openInventory(craftBlocksGui.invGui);
			}
		}else if ( e.getInventory().getTitle().equals("§l合成台 §l武器") ) {
			e.setCancelled(true);
			if ( e.getRawSlot()==49 ) {
				e.getWhoClicked().closeInventory();
			}
			if ( e.getRawSlot()==48 ) {
				craftGui.openCraftGui((Player) e.getWhoClicked());
				e.getWhoClicked().openInventory(craftGui.invGui);
			}
			if ( e.getRawSlot()==11 ) {
				// arm1
				if ( hasItem((Player) e.getWhoClicked(), Material.STAINED_GLASS, 6, 11) && hasItem((Player) e.getWhoClicked(), Material.DIAMOND_SWORD, 1, 0) ) {
					e.getWhoClicked().getInventory().removeItem(new ItemStack(Material.STAINED_GLASS, 6, (short)11));
					e.getWhoClicked().getInventory().removeItem(new ItemStack(Material.DIAMOND_SWORD, 1));
				}
			}
		}
	}
	
	public boolean hasItem(Player player, Material item, int num, int durability) {
		for ( ItemStack i : player.getInventory().getContents() ) {
			if ( i!=null ) {
				if ( i.getType().equals(item) && i.getDurability()==durability && i.getAmount()>=num && !i.getItemMeta().hasLore() ) {
					return true;
				}
			}
		}
		return false;
	}
	
}
