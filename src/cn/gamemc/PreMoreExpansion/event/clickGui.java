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
		// �ж�Gui
		if ( e.getInventory().getTitle().equals("��l�ϳ�̨ ��l����ѡ��") ) {
			// �����޸�Gui
			e.setCancelled(true);
			// �ر�
			if ( e.getRawSlot()==49 ) {
				e.getWhoClicked().closeInventory();
			}
			// �������ϳ�
			if ( e.getRawSlot()==20 ) {
				craftArmsGui.openCraftArmsGui((Player) e.getWhoClicked());
				e.getWhoClicked().openInventory(craftArmsGui.invGui);
			}
			// �򿪹��ߺϳ�
			if ( e.getRawSlot()==21 ) {
				craftToolsGui.openCraftArmsGui((Player) e.getWhoClicked());
				e.getWhoClicked().openInventory(craftToolsGui.invGui);
			}
			// ��ʳ��ϳ�
			if ( e.getRawSlot()==22 ) {
				craftFoodGui.openCraftArmsGui((Player) e.getWhoClicked());
				e.getWhoClicked().openInventory(craftFoodGui.invGui);
			}
			// �򿪷���ϳ�
			if ( e.getRawSlot()==23 ) {
				craftBlocksGui.openCraftArmsGui((Player) e.getWhoClicked());
				e.getWhoClicked().openInventory(craftBlocksGui.invGui);
			}
		}else if ( e.getInventory().getTitle().equals("��l�ϳ�̨ ��l����") ) {
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
