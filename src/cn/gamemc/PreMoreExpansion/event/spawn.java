package cn.gamemc.PreMoreExpansion.event;

import cn.gamemc.PreMoreExpansion.item.mobs;
import cn.gamemc.PreMoreExpansion.main.configMobs;
import cn.gamemc.PreMoreExpansion.main.main;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class spawn implements Listener {
	// 监听实体生成
	  @EventHandler
	  public void mobSpawn(final CreatureSpawnEvent e) {
		  // 延时任务
		  Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
			  public void run() {
				  
				  // mob1
				  // 判断
				  if ( (e.getEntity().getCustomName() != null) && (e.getEntity().getCustomName().equals(configMobs.mobsYml.getString("mobs.mob1.name").replaceAll("&", "§"))) ) {
					  try {
						  // 模型
						  e.getEntity().getEquipment().setHelmet(mobs.mob1);
						  // 隐身
						  e.getEntity().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 2147483647, 1));
						  // 全息显示跟随
						  if ( Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
							  final Hologram hologram = HologramsAPI.createHologram(main.getPlugin(main.class), e.getEntity().getLocation().add(0.0D, 2.5D, 0.0D));
					            hologram.appendTextLine(configMobs.mobsYml.getString("mobs.mob1.name").replaceAll("&", "§"));
					            new BukkitRunnable() {
					            	public void run() {
					            		if ( !e.getEntity().isDead() ) {
					            			hologram.teleport(e.getEntity().getLocation().add(0.0D, 2.5D, 0.0D));
					            		}else {
					            			hologram.delete();
					            			cancel();
					            		}
					            	}
					            }.runTaskTimer(main.getPlugin(main.class), 1L, 1L);  
						  }
					  }catch (Exception localException) {
					  }
				  }
				  
				  // mob2
				  if ( (e.getEntity().getCustomName() != null) && (e.getEntity().getCustomName().equals(configMobs.mobsYml.getString("mobs.mob2.name").replaceAll("&", "§"))) ) {
					  try {
						  e.getEntity().getEquipment().setHelmet(mobs.mob2);
						  e.getEntity().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 2147483647, 1));
						  if ( Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
							  final Hologram hologram = HologramsAPI.createHologram(main.getPlugin(main.class), e.getEntity().getLocation().add(0.0D, 3D, 0.0D));
					            hologram.appendTextLine(configMobs.mobsYml.getString("mobs.mob2.name").replaceAll("&", "§"));
					            new BukkitRunnable() {
					            	public void run() {
					            		if ( !e.getEntity().isDead() ) {
					            			hologram.teleport(e.getEntity().getLocation().add(0.0D, 3D, 0.0D));
					            		}else {
					            			hologram.delete();
					            			cancel();
					            		}
					            	}
					            }.runTaskTimer(main.getPlugin(main.class), 1L, 1L);
						  }
					  }catch (Exception localException) {
					  }
				  }
				  
			  }		  
		  }, 5L);
	  }
}
