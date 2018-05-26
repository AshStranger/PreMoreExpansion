package cn.gamemc.PreMoreExpansion.event;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;

import cn.gamemc.PreMoreExpansion.build.buildPacket;
import cn.gamemc.PreMoreExpansion.main.configFood;
import cn.gamemc.PreMoreExpansion.main.main;

public class eat implements Listener {
	
	@EventHandler
	public void onEat(PlayerItemConsumeEvent e) {
		int oldFood = e.getPlayer().getFoodLevel();
		if ( e.getItem().getItemMeta().hasLore() ) {
			List<String> getLore = e.getItem().getItemMeta().getLore();
			for ( String lore : getLore ) {
				if ( lore.equals("§a§f§f§f§c§a§1") ) {
					if ( configFood.foodYml.getBoolean("food.food1.enable")!=false ) {
						int playerFood = e.getPlayer().getFoodLevel();
						int configFood = main.here.getConfig().getInt("food.food1.addFood");
						if ( configFood!=0 ) {
							e.getPlayer().setFoodLevel(playerFood+configFood);
						}
					}
				}
			}
		}
		// 延时任务
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
			public void run() {
				int newFood = e.getPlayer().getFoodLevel();
				int getAddFood = newFood-oldFood;
				// 弹幕饥饿显示
				if ( main.pm!=null ) {
					if ( main.here.getConfig().getBoolean("Settings.Title.hungry.text")==true ) {
						buildPacket.sendTitle(e.getPlayer(), "§a+ "+getAddFood, "§6饥饿值", 0, 20, 0);
					}
				}
				// 全息饥饿显示
				if ( Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
					if ( main.here.getConfig().getBoolean("Settings.Hologram.hungry.text")==true ) {
						Hologram damageHologram = HologramsAPI.createHologram(main.getPlugin(main.class), e.getPlayer().getLocation().add(0.0D, 3.5D, 0.0D));
						damageHologram.appendTextLine("§6§l+ §6§l" + getAddFood);
						// 延时任务
						Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
							public void run() {
								damageHologram.delete();
							}
						}, 10L);
					}else if ( main.here.getConfig().getBoolean("Settings.Hologram.hungry.item")==true ) {
						Hologram damageHologram = HologramsAPI.createHologram(main.getPlugin(main.class), e.getPlayer().getLocation().add(0.0D, 3.5D, 0.0D));
						damageHologram.appendTextLine("§6§l+ §6§l" + getAddFood);
						ItemStack hologramItem = new ItemStack(Material.COOKED_CHICKEN);
						damageHologram.appendItemLine(hologramItem);
						// 延时任务
						Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
							public void run() {
								damageHologram.delete();
							}
						}, 10L);
					}
				}
			}
		}, 1L);
	}
	
}
