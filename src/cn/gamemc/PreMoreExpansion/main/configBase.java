package cn.gamemc.PreMoreExpansion.main;

import java.io.File;

public class configBase {
	
	public static void yml() {
		// ��������
		// config.yml
		if ( !new File(main.here.getDataFolder(), "config.yml").exists() ) {
			main.here.saveDefaultConfig();
	    }
		
		// ��������
		// config.yml
		// �˺�ȫϢ�ı�
		main.here.getConfig().set("Settings.Hologram.damage.text", main.here.getConfig().getBoolean("Settings.Hologram.damage.text"));
		// �˺�ȫϢ�ı�����Ŀ
		main.here.getConfig().set("Settings.Hologram.damage.item", main.here.getConfig().getBoolean("Settings.Hologram.damage.item"));
		// ����ȫϢ�ı�
		main.here.getConfig().set("Settings.Hologram.hungry.text", main.here.getConfig().getBoolean("Settings.Hologram.hungry.text"));
		// ����ȫϢ�ı�����Ŀ
		main.here.getConfig().set("Settings.Hologram.hungry.item", main.here.getConfig().getBoolean("Settings.Hologram.hungry.item"));
		// �˺���Ļ
		main.here.getConfig().set("Settings.Title.damage.text", main.here.getConfig().getBoolean("Settings.Title.damage.text"));
		// ������Ļ
		main.here.getConfig().set("Settings.Title.hungry.text", main.here.getConfig().getBoolean("Settings.Title.hungry.text"));
		
		// ��������
		// config.yml
		main.here.saveConfig();
	}
	
}