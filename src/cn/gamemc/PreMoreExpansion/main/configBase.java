package cn.gamemc.PreMoreExpansion.main;

import java.io.File;

public class configBase {
	
	public static void yml() {
		// 创建配置
		// config.yml
		if ( !new File(main.here.getDataFolder(), "config.yml").exists() ) {
			main.here.saveDefaultConfig();
	    }
		
		// 加载配置
		// config.yml
		// 伤害全息文本
		main.here.getConfig().set("Settings.Hologram.damage.text", main.here.getConfig().getBoolean("Settings.Hologram.damage.text"));
		// 伤害全息文本和项目
		main.here.getConfig().set("Settings.Hologram.damage.item", main.here.getConfig().getBoolean("Settings.Hologram.damage.item"));
		// 饥饿全息文本
		main.here.getConfig().set("Settings.Hologram.hungry.text", main.here.getConfig().getBoolean("Settings.Hologram.hungry.text"));
		// 饥饿全息文本和项目
		main.here.getConfig().set("Settings.Hologram.hungry.item", main.here.getConfig().getBoolean("Settings.Hologram.hungry.item"));
		// 伤害弹幕
		main.here.getConfig().set("Settings.Title.damage.text", main.here.getConfig().getBoolean("Settings.Title.damage.text"));
		// 饥饿弹幕
		main.here.getConfig().set("Settings.Title.hungry.text", main.here.getConfig().getBoolean("Settings.Title.hungry.text"));
		
		// 保存配置
		// config.yml
		main.here.saveConfig();
	}
	
}