package cn.gamemc.PreMoreExpansion.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class configFood {
	
	public static FileConfiguration foodYml;

	public static void yml() {
		// ��������
		// food.yml
		File foodFile = new File(main.here.getDataFolder(),"food.yml");
		foodYml = foodFile.exists() ? YamlConfiguration.loadConfiguration(foodFile) : new YamlConfiguration();
        if ( !foodFile.exists() ) {
        	try {
        		foodFile.createNewFile();
			} catch (IOException e) {
			}
        }
        
        // ��������
        // food.yml
        // food1
        if ( !foodYml.contains("food.food1.enable") ) {
        	foodYml.set("food.food1.enable", true);
        }
        if ( !foodYml.contains("food.food1.name") ) {
        	foodYml.set("food.food1.name", "&a��ƻ��");
        }
        if ( !foodYml.contains("food.food1.addFood") ) {
        	foodYml.set("food.food1.addFood", 2);
        }
        
        // ��������
        // food.yml
    	try {
    		foodYml.save(foodFile);
		} catch (IOException e) {
		}
	}

}
