package cn.gamemc.PreMoreExpansion.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class configTools {

	public static FileConfiguration toolsYml;

	public static void yml() {
		// 创建配置
		// tools.yml
		File toolsFile = new File(main.here.getDataFolder(),"tools.yml");
		toolsYml = toolsFile.exists() ? YamlConfiguration.loadConfiguration(toolsFile) : new YamlConfiguration();
        if ( !toolsFile.exists() ) {
        	try {
        		toolsFile.createNewFile();
			} catch (IOException e) {
			}
        }
        
        // 加载配置
        // tools.yml
        // tool1
        if ( !toolsYml.contains("tools.tool1.enable") ) {
        	toolsYml.set("tools.tool1.enable", true);
        }
        if ( !toolsYml.contains("tools.tool1.name") ) {
        	toolsYml.set("tools.tool1.name", "&a石斧子");
        }
        if ( !toolsYml.contains("tools.tool1.damage") ) {
        	toolsYml.set("tools.tool1.damage", 3);
        }
        
        // 保存配置
        // tools.yml
    	try {
    		toolsYml.save(toolsFile);
		} catch (IOException e) {
		}
	}

}
