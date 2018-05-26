package cn.gamemc.PreMoreExpansion.skill;

import java.util.List;

import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import cn.gamemc.PreMoreExpansion.build.map;
import cn.gamemc.PreMoreExpansion.main.configArms;

public class skillShoot implements Listener {
	
	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		if ( e.getAction()==Action.RIGHT_CLICK_AIR ) {
			if ( e.getPlayer().getEquipment().getItemInMainHand().getItemMeta()!=null ) {
				List<String> lore = e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore();
				if ( lore != null ) {
					for ( String s : lore ) {
						// arm5
						if (s.equals("¡ìa¡ìf¡ìf¡ìf¡ìa¡ìa¡ì5")) {
							System.out.println(map.spellsTime1.get(e.getPlayer().getName()));
							if ( map.spellsTime1.get(e.getPlayer().getName())==null || map.spellsTime1.get(e.getPlayer().getName())==0 ) {
								skillAll.lineParticle(e.getPlayer(), Particle.VILLAGER_HAPPY, configArms.armsYml.getInt("arms.arm5.spellsFar"));
								map.spellsTime1.put(e.getPlayer().getName(), configArms.armsYml.getInt("arms.arm5.spellsTime"));
							}
						}
					}
				}
			}
		}
	}
	
}
