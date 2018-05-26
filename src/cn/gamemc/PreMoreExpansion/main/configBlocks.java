package cn.gamemc.PreMoreExpansion.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class configBlocks {

	public static FileConfiguration blocksYml;

	public static void yml() {
		// ��������
		// blocks.yml
		File blocksFile = new File(main.here.getDataFolder(),"blocks.yml");
		blocksYml = blocksFile.exists() ? YamlConfiguration.loadConfiguration(blocksFile) : new YamlConfiguration();
        if ( !blocksFile.exists() ) {
        	try {
        		blocksFile.createNewFile();
			} catch (IOException e) {
			}
        }
        
        // ��������
        // blocks.yml
        // block1
        if ( !blocksYml.contains("blocks.block1.enable") ) {
        	blocksYml.set("blocks.block1.enable", true);
        }
        if ( !blocksYml.contains("blocks.block1.name") ) {
        	blocksYml.set("blocks.block1.name", "&6�ϳ�̨");
        }
        
        // ��������
        // blocks.yml
    	try {
    		blocksYml.save(blocksFile);
		} catch (IOException e) {
		}
	}

}
