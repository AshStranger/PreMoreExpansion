package cn.gamemc.PreMoreExpansion.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class configMobs {
	
	public static FileConfiguration mobsYml;

	public static void yml() {
		// ¥¥Ω®≈‰÷√
		// mobs.yml
		File mobsFile = new File(main.here.getDataFolder(),"mobs.yml");
		mobsYml = mobsFile.exists() ? YamlConfiguration.loadConfiguration(mobsFile) : new YamlConfiguration();
        if ( !mobsFile.exists() ) {
        	try {
        		mobsFile.createNewFile();
			} catch (IOException e) {
			}
        }
        
        // º”‘ÿ≈‰÷√
        // mobs.yml
        // mob1
        if ( !mobsYml.contains("mobs.mob1.name") ) {
        	mobsYml.set("mobs.mob1.name", "&aMOB-1");
        }
        // mob2
    	if ( !mobsYml.contains("mobs.mob2.name") ) {
        	mobsYml.set("mobs.mob2.name", "&aMOB-2");
    	}
        
        // ±£¥Ê≈‰÷√
        // mobs.yml
    	try {
    		mobsYml.save(mobsFile);
		} catch (IOException e) {
		}
	}

}
