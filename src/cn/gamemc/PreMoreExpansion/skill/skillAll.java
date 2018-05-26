package cn.gamemc.PreMoreExpansion.skill;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import com.gmail.filoghost.holographicdisplays.api.VisibilityManager;

import cn.gamemc.PreMoreExpansion.build.buildPacket;
import cn.gamemc.PreMoreExpansion.main.configArms;
import cn.gamemc.PreMoreExpansion.main.main;

public class skillAll {
	
	// ����
	// ֱ�����
	public static void lineParticle(Player player, Particle particle, int number) {
		// �������
		Location loc = player.getLocation();
		// �������
		Vector vector = loc.getDirection();
		// �޸�����
		loc.add(0, 1, 0);
		loc.add(vector);
        new BukkitRunnable() {
        	int endNumber = 0;
            @Override
            public void run() {
            	loc.add(vector);
            	player.getWorld().spawnParticle(particle, loc, 1);
            	int particleX = (int) loc.getX();
            	int particleY = (int) loc.getY();
            	int particleZ = (int) loc.getZ();
            	for ( Entity entity : player.getNearbyEntities(number, number, number) ) {
            		// ����ʵ��
            		if ( (int) entity.getLocation().getX()==particleX && (int) entity.getLocation().getY()==particleY && (int) entity.getLocation().getZ()==particleZ ) {
            			if ( !entity.getType().equals(EntityType.PLAYER) && !entity.getType().equals(EntityType.DROPPED_ITEM) ) {
            				LivingEntity hurter = (LivingEntity) entity;
            				hurter.damage(configArms.armsYml.getInt("arms.arm5.spellsDamage"));
            				ydxzParticle(entity, Particle.END_ROD);
            				cancel();
            				// ��Ļ�˺���ʾ
            				if ( main.pm!=null ) {
            					if ( main.here.getConfig().getBoolean("Settings.Title.damage.text")==true ) {
            						buildPacket.sendTitle(player, "", "��c- ��6" + configArms.armsYml.getInt("arms.arm5.spellsDamage"), 0, 10, 0);
            					}
            				}
            				// ȫϢ�˺���ʾ
            				if ( Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
            					if ( main.here.getConfig().getBoolean("Settings.Hologram.damage.text")==true ) {
            						Hologram damageHologram = HologramsAPI.createHologram(main.getPlugin(main.class), entity.getLocation().add(0.0D, 3D, 0.0D));
            						VisibilityManager visiblity = damageHologram.getVisibilityManager();
            						visiblity.showTo(player);
            						visiblity.setVisibleByDefault(false);
            						damageHologram.appendTextLine("��c��l- ��6��l" + configArms.armsYml.getInt("arms.arm5.spellsDamage"));
            						// ��ʱ����
            						Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
            							public void run() {
            								damageHologram.delete();
            							}
            						}, 10L);
            					}else if ( main.here.getConfig().getBoolean("Settings.Hologram.damage.item")==true ) {
            						Hologram damageHologram = HologramsAPI.createHologram(main.getPlugin(main.class), entity.getLocation().add(0.0D, 3D, 0.0D));
            						VisibilityManager visiblity = damageHologram.getVisibilityManager();
            						visiblity.showTo(player);
            						visiblity.setVisibleByDefault(false);
            						damageHologram.appendTextLine("��c��l- ��6��l" + configArms.armsYml.getInt("arms.arm5.spellsDamage"));
            						ItemStack hologramItem = new ItemStack(Material.MAGMA_CREAM);
            						damageHologram.appendItemLine(hologramItem);
            						// ��ʱ����
            						Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
            							public void run() {
            								damageHologram.delete();
            							}
            						}, 10L);
            					}
            				}
            			}
            		}
            	}
            	if ( endNumber==number ) cancel();
                endNumber++;
            }
        }.runTaskTimer(main.here, 0, 1);
	}
	
	// ԭ����ת����
	public static void ydxzParticle(Entity entity, Particle particle) {
        Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
			public void run() {
				Location loc1 = entity.getLocation();
				loc1.add(1, 1, 0);
				entity.getWorld().spawnParticle(particle, loc1, 3);
		        Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
					public void run() {
						Location loc1 = entity.getLocation();
						loc1.add(0, 1, 1);
						entity.getWorld().spawnParticle(particle, loc1, 3);
				        Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
							public void run() {
								Location loc1 = entity.getLocation();
								loc1.add(-1, 1, 0);
								entity.getWorld().spawnParticle(particle, loc1, 3);
						        Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
									public void run() {
										Location loc1 = entity.getLocation();
										loc1.add(0, 1, -1);
										entity.getWorld().spawnParticle(particle, loc1, 3);
									}
								}, 10L);
							}
						}, 10L);
					}
				}, 10L);
			}
		}, 10L);
	}

}
