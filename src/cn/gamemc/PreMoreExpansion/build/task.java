package cn.gamemc.PreMoreExpansion.build;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import cn.gamemc.PreMoreExpansion.main.main;

public class task {
	
	public static void spellsTimeMap() {
	    new BukkitRunnable() {
	    	public void run() {
	    		for ( Player player : Bukkit.getOnlinePlayers() ) {
	    			if ( player!=null ) {
	    				// arm5 time
	    				if ( map.spellsTime1.get(player.getName())!=null && map.spellsTime1.get(player.getName())>0 ) {
	    					map.spellsTime1.put(player.getName(), map.spellsTime1.get(player.getName())-1);
	    				}
	    			}
	    		}
	    	}
	    }.runTaskTimer(main.getPlugin(main.class), 20L, 20L);
	}
	
}
