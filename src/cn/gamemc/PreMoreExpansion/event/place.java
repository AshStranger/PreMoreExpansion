package cn.gamemc.PreMoreExpansion.event;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import cn.gamemc.PreMoreExpansion.item.blocks;

public class place implements Listener {
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		// Á£×Ó²âÊÔ
		//skillAll.lineParticle(e.getPlayer(), Particle.VILLAGER_HAPPY, 12);
        // »ð¼ý¼¼ÄÜ
		/*for (int count = 0; count < 20; count++) {
            Vector bulletDirection = e.getPlayer().getEyeLocation().getDirection().multiply(3);
            bulletDirection.add(new Vector(Math.random(), Math.random(), Math.random()));
           
            Arrow bullet = (Arrow) e.getPlayer().getWorld().spawnEntity(e.getPlayer().getEyeLocation(), EntityType.ARROW);
           
            bullet.setShooter(e.getPlayer());
            bullet.setFireTicks(1000);
            bullet.setVelocity(bulletDirection);
        }*/
        
		if ( e.getPlayer().getEquipment().getItemInMainHand().hasItemMeta() && e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().hasLore() ) {
			List<String> lore = e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore();
			for ( String s : lore ) {
				if ( s.equals("¡ìa¡ìf¡ìf¡ìf¡ìd¡ìa¡ì1") ) {
					e.getBlock().setType(Material.AIR);
					org.bukkit.Location loc = e.getBlock().getLocation().add(0.5, 0, 0.5);
					ArmorStand block = (ArmorStand) e.getPlayer().getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
					block.setCustomNameVisible(false);
					block.getEquipment().setHelmet(blocks.block1);
					block.setGravity(false);
					block.setVisible(false);
					block.setSmall(true);
					block.setCustomName("¡ìa¡ìf¡ìf¡ìf¡ìd¡ìa¡ì1");
				}
			}
		}
	}

}
