package cn.gamemc.PreMoreExpansion.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class configTools {

	public static FileConfiguration toolsYml;

	public static void yml() {
		// ��������
		// tools.yml
		File toolsFile = new File(main.here.getDataFolder(),"tools.yml");
		toolsYml = toolsFile.exists() ? YamlConfiguration.loadConfiguration(toolsFile) : new YamlConfiguration();
        if ( !toolsFile.exists() ) {
        	try {
        		toolsFile.createNewFile();
			} catch (IOException e) {
			}
        }
        
        // ��������
        // tools.yml
        // tool1
        if ( !toolsYml.contains("tools.tool1.enable") ) {
        	toolsYml.set("tools.tool1.enable", true);
        }
        if ( !toolsYml.contains("tools.tool1.name") ) {
        	toolsYml.set("tools.tool1.name", "&aʯ����");
        }
        if ( !toolsYml.contains("tools.tool1.damage") ) {
        	toolsYml.set("tools.tool1.damage", 3);
        }
        
        // ��������
        // tools.yml
    	try {
    		toolsYml.save(toolsFile);
		} catch (IOException e) {
		}
	}

}
