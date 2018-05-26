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
	
	// ��ֵ
	FileConfiguration config = getConfig();
	public static JavaPlugin here;
	public static ProtocolManager pm;
	public static String version;
	public static String name;
	
	@Override
	public void onEnable() {
		
		version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
		
		// ���������Ϣ
		getLogger().info("[ - [PreMoreExpansion] ���ڼ�� - ]");
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
			getLogger().info("  -  �汾��������");
			getLogger().info("[ - [PreMoreExpansion] ֹͣ���� - ]");
			return;
		}else {
			getLogger().info("  -  �汾������");
		}
		if ( !Bukkit.getPluginManager().isPluginEnabled("ProtocolLib") ) {
			getLogger().info("  -  δ��װ�����ProtocolLib");
		}else {
			getLogger().info("  -  �Ѱ�װ�����ProtocolLib");
			pm = ProtocolLibrary.getProtocolManager();
		}
		if ( !Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
			getLogger().info("  -  δ��װ�����HolographicDisplays");
			}else {
				getLogger().info("  -  �Ѱ�װ�����HolographicDisplays");
		}
		getLogger().info("  -  �����ǰ�汾��0.0.1");
		getLogger().info("  -  ������Դ���汾��0.0.1");
		getLogger().info("[ - [PreMoreExpansion] ������ - ]");
		getLogger().info("[ - [PreMoreExpansion] �������� - ]");
		
		// ��ֵ
		here = this;
		
		// ע��
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
	    
	    // ����
	    // ����
	    task.spellsTimeMap();
	    // ����
	    configBase.yml();
	    configArms.yml();
	    configMobs.yml();
	    configFood.yml();
	    configBlocks.yml();
	    configTools.yml();
	    // ��Ʒ
	    arms.arm();
	    mobs.mob();
	    food.allFood();
	    blocks.block();
	    tools.tool();
	    gui.allGui();
	    
	}
	
	@Override
	public void onDisable() {
		getLogger().info("[MoreExpansion] �ѹر�");
	}
	
}
