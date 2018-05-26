package cn.gamemc.PreMoreExpansion.main;

import cn.gamemc.PreMoreExpansion.build.task;
import cn.gamemc.PreMoreExpansion.event.clickEnity;
import cn.gamemc.PreMoreExpansion.event.clickGui;
import cn.gamemc.PreMoreExpansion.event.closeGui;
import cn.gamemc.PreMoreExpansion.event.damage;
import cn.gamemc.PreMoreExpansion.event.eat;
import cn.gamemc.PreMoreExpansion.event.place;
import cn.gamemc.PreMoreExpansion.event.spawn;
import cn.gamemc.PreMoreExpansion.gui.gui;
import cn.gamemc.PreMoreExpansion.item.arms;
import cn.gamemc.PreMoreExpansion.item.blocks;
import cn.gamemc.PreMoreExpansion.item.food;
import cn.gamemc.PreMoreExpansion.item.mobs;
import cn.gamemc.PreMoreExpansion.item.tools;
import cn.gamemc.PreMoreExpansion.skill.skillShoot;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;

public class main extends JavaPlugin {
	
	// 赋值
	FileConfiguration config = getConfig();
	public static JavaPlugin here;
	public static ProtocolManager pm;
	public static String version;
	public static String name;
	
	@Override
	public void onEnable() {
		
		version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
		
		// 插件加载信息
		getLogger().info("[ - [PreMoreExpansion] 正在检查 - ]");
		if ( version.equals("v1_9_R1") ) {
			name = "v1_9_R1";
		} else if( version.equals("v1_9_R2") ) {
			name = "v1_9_R2";
		} else if ( version.equals("v1_10_R1") ) {
			name = "v1_10_R1";
		} else if ( version.equals("v1_11_R1") ) {
			name = "v1_11_R1";
		} else if ( version.equals("v1_12_R1" )) {
			name = "v1_12_R1";
		} else {
			name = null;
		}
		if ( name == null ) {
			getLogger().info("  -  版本：不兼容");
			getLogger().info("[ - [PreMoreExpansion] 停止运行 - ]");
			return;
		}else {
			getLogger().info("  -  版本：兼容");
		}
		if ( !Bukkit.getPluginManager().isPluginEnabled("ProtocolLib") ) {
			getLogger().info("  -  未安装插件：ProtocolLib");
		}else {
			getLogger().info("  -  已安装插件：ProtocolLib");
			pm = ProtocolLibrary.getProtocolManager();
		}
		if ( !Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
			getLogger().info("  -  未安装插件：HolographicDisplays");
			}else {
				getLogger().info("  -  已安装插件：HolographicDisplays");
		}
		getLogger().info("  -  插件当前版本：0.0.1");
		getLogger().info("  -  搭配资源包版本：0.0.1");
		getLogger().info("[ - [PreMoreExpansion] 检查完毕 - ]");
		getLogger().info("[ - [PreMoreExpansion] 正常运行 - ]");
		
		// 赋值
		here = this;
		
		// 注册
		getServer().getPluginManager().registerEvents(new damage(), this);
	    getServer().getPluginManager().registerEvents(new spawn(), this);
	    getServer().getPluginManager().registerEvents(new eat(), this);
	    getServer().getPluginManager().registerEvents(new place(), this);
	    getServer().getPluginManager().registerEvents(new clickEnity(), this);
	    getServer().getPluginManager().registerEvents(new clickGui(), this);
	    getServer().getPluginManager().registerEvents(new closeGui(), this);
	    getServer().getPluginManager().registerEvents(new skillShoot(), this);
	    Bukkit.getPluginCommand("morexhelp").setExecutor(new cmdHelp());
	    Bukkit.getPluginCommand("morexgive").setExecutor(new cmdGive());
	    
	    // 加载
	    // 任务
	    task.spellsTimeMap();
	    // 配置
	    configBase.yml();
	    configArms.yml();
	    configMobs.yml();
	    configFood.yml();
	    configBlocks.yml();
	    configTools.yml();
	    // 物品
	    arms.arm();
	    mobs.mob();
	    food.allFood();
	    blocks.block();
	    tools.tool();
	    gui.allGui();
	    
	}
	
	@Override
	public void onDisable() {
		getLogger().info("[MoreExpansion] 已关闭");
	}
	
}
