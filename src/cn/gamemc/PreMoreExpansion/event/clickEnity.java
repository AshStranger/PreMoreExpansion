package cn.gamemc.PreMoreExpansion.event;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import cn.gamemc.PreMoreExpansion.build.buildPacket;
import cn.gamemc.PreMoreExpansion.gui.craftGui;
import cn.gamemc.PreMoreExpansion.item.blocks;
import cn.gamemc.PreMoreExpansion.main.configBlocks;
import cn.gamemc.PreMoreExpansion.main.configTools;
import cn.gamemc.PreMoreExpansion.main.main;

public class clickEnity implements Listener {
	
	@EventHandler
	// 右键实体事件
	public void clickEntity(PlayerInteractAtEntityEvent e) {
		// 对实体放置
		// 处于开发测试阶段
		/*e.setCancelled(true);
		Entity en = e.getRightClicked();
        if(en instanceof ArmorStand){
                Vector position = e.getClickedPosition();
                en.getWorld().getBlockAt(e.getRightClicked().getLocation().add(0, position.getY(), 0).add(e.getClickedPosition().setY(position.getY() / (((ArmorStand)en).getEyeHeight() * 4)).normalize())).setType(Material.STONE);
        }*/
		
		if ( e.getRightClicked().getType().equals(EntityType.ARMOR_STAND) ) {
			// 用指定工具破坏
			if ( e.getRightClicked().getCustomName()!=null ) {
				// 判断实体的名字
				if ( e.getRightClicked().getCustomName().equals("§a§f§f§f§d§a§1") ) {
					// 防止盔甲架被修改
					e.setCancelled(true);
					// 如果手有东西并且有Lore
					if ( e.getPlayer().getEquipment().getItemInMainHand().getItemMeta()!=null && e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().hasLore()) {
						// 摧毁block1
						// 如果物品Lore匹配正确则进行下一步匹配
						if ( e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore().get(0)!=null && e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore().get(0).equals("§a§f§f§f§e§a§1") ) {
							// 物品名字匹配正确则摧毁block1[合成台]
							if ( e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getDisplayName().equals(configTools.toolsYml.getString("tools.tool1.name").replaceAll("&", "§")) ) {
								e.getRightClicked().remove();
								e.getPlayer().getWorld().dropItem(e.getRightClicked().getLocation(), blocks.block1);
								if ( main.pm!=null ) {
									buildPacket.sendTitle(e.getPlayer(), "§6"+configBlocks.blocksYml.getString("blocks.block1.name").replaceAll("&", "§"), "§c已摧毁", 0, 20, 0);
								}
							}else {
								// 物品名字匹配不正确则打开block1[合成台]
								craftGui.openCraftGui(e.getPlayer());
								e.getPlayer().openInventory(craftGui.invGui);
							}
						}else {
								// 如果Lore匹配不正确则打开block1[合成台]
								craftGui.openCraftGui(e.getPlayer());
								e.getPlayer().openInventory(craftGui.invGui);
						}
					}else {
						// 没有东西或没有Lore时打开block1[合成台]
						craftGui.openCraftGui(e.getPlayer());
						e.getPlayer().openInventory(craftGui.invGui);
					}
				}
			}
		}
	}

}
