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
	// �Ҽ�ʵ���¼�
	public void clickEntity(PlayerInteractAtEntityEvent e) {
		// ��ʵ�����
		// ���ڿ������Խ׶�
		/*e.setCancelled(true);
		Entity en = e.getRightClicked();
        if(en instanceof ArmorStand){
                Vector position = e.getClickedPosition();
                en.getWorld().getBlockAt(e.getRightClicked().getLocation().add(0, position.getY(), 0).add(e.getClickedPosition().setY(position.getY() / (((ArmorStand)en).getEyeHeight() * 4)).normalize())).setType(Material.STONE);
        }*/
		
		if ( e.getRightClicked().getType().equals(EntityType.ARMOR_STAND) ) {
			// ��ָ�������ƻ�
			if ( e.getRightClicked().getCustomName()!=null ) {
				// �ж�ʵ�������
				if ( e.getRightClicked().getCustomName().equals("��a��f��f��f��d��a��1") ) {
					// ��ֹ���׼ܱ��޸�
					e.setCancelled(true);
					// ������ж���������Lore
					if ( e.getPlayer().getEquipment().getItemInMainHand().getItemMeta()!=null && e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().hasLore()) {
						// �ݻ�block1
						// �����ƷLoreƥ����ȷ�������һ��ƥ��
						if ( e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore().get(0)!=null && e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore().get(0).equals("��a��f��f��f��e��a��1") ) {
							// ��Ʒ����ƥ����ȷ��ݻ�block1[�ϳ�̨]
							if ( e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getDisplayName().equals(configTools.toolsYml.getString("tools.tool1.name").replaceAll("&", "��")) ) {
								e.getRightClicked().remove();
								e.getPlayer().getWorld().dropItem(e.getRightClicked().getLocation(), blocks.block1);
								if ( main.pm!=null ) {
									buildPacket.sendTitle(e.getPlayer(), "��6"+configBlocks.blocksYml.getString("blocks.block1.name").replaceAll("&", "��"), "��c�Ѵݻ�", 0, 20, 0);
								}
							}else {
								// ��Ʒ����ƥ�䲻��ȷ���block1[�ϳ�̨]
								craftGui.openCraftGui(e.getPlayer());
								e.getPlayer().openInventory(craftGui.invGui);
							}
						}else {
								// ���Loreƥ�䲻��ȷ���block1[�ϳ�̨]
								craftGui.openCraftGui(e.getPlayer());
								e.getPlayer().openInventory(craftGui.invGui);
						}
					}else {
						// û�ж�����û��Loreʱ��block1[�ϳ�̨]
						craftGui.openCraftGui(e.getPlayer());
						e.getPlayer().openInventory(craftGui.invGui);
					}
				}
			}
		}
	}

}
