package cn.gamemc.PreMoreExpansion.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class configArms {
	
	public static FileConfiguration armsYml;

	public static void yml() {
		// 创建配置
		// arms.yml
		File armsFile = new File(main.here.getDataFolder(),"arms.yml");
		armsYml = armsFile.exists() ? YamlConfiguration.loadConfiguration(armsFile) : new YamlConfiguration();
        if ( !armsFile.exists() ) {
        	try {
        		armsFile.createNewFile();
			} catch (IOException e) {
			}
        }
        
        // 加载配置
        // arms.yml
        // arm1
        if ( !armsYml.contains("arms.arm1.enable") ) {
        	armsYml.set("arms.arm1.enable", true);
        }
        if ( !armsYml.contains("arms.arm1.name") ) {
        	armsYml.set("arms.arm1.name", "&b蓝色激光剑");
        }
        if ( !armsYml.contains("arms.arm1.damage") ) {
        	armsYml.set("arms.arm1.damage", 8);
        }
        // arm2
        if ( !armsYml.contains("arms.arm2.enable") ) {
        	armsYml.set("arms.arm2.enable", true);
        }
        if ( !armsYml.contains("arms.arm2.name") ) {
        	armsYml.set("arms.arm2.name", "&c红色激光剑");
        }
        if ( !armsYml.contains("arms.arm2.damage") ) {
        	armsYml.set("arms.arm2.damage", 8);
        }
        // arm3
        if ( !armsYml.contains("arms.arm3.enable") ) {
        	armsYml.set("arms.arm3.enable", true);
        }
        if ( !armsYml.contains("arms.arm3.name") ) {
        	armsYml.set("arms.arm3.name", "&a绿色激光剑");
        }
        if ( !armsYml.contains("arms.arm3.damage") ) {
        	armsYml.set("arms.arm3.damage", 8);
        }
        // arm4
        if ( !armsYml.contains("arms.arm4.enable") ) {
        	armsYml.set("arms.arm4.enable", true);
        }
        if ( !armsYml.contains("arms.arm4.name") ) {
        	armsYml.set("arms.arm4.name", "&e黄色激光剑");
        }
        if ( !armsYml.contains("arms.arm4.damage") ) {
        	armsYml.set("arms.arm4.damage", 8);
        }
        // arm5
        if ( !armsYml.contains("arms.arm5.enable") ) {
        	armsYml.set("arms.arm5.enable", true);
        }
        if ( !armsYml.contains("arms.arm5.name") ) {
        	armsYml.set("arms.arm5.name", "&d法至之杖");
        }
        if ( !armsYml.contains("arms.arm5.damage") ) {
        	armsYml.set("arms.arm5.damage", 3);
        }
        if ( !armsYml.contains("arms.arm5.spellsDamage") ) {
        	armsYml.set("arms.arm5.spellsDamage", 5);
        }
        if ( !armsYml.contains("arms.arm5.spellsTime") ) {
        	armsYml.set("arms.arm5.spellsTime", 10);
        }
        if ( !armsYml.contains("arms.arm5.spellsFar") ) {
        	armsYml.set("arms.arm5.spellsFar", 12);
        }
        
        // 保存配置
        // arms.yml
    	try {
    		armsYml.save(armsFile);
		} catch (IOException e) {
		}
	}

}
