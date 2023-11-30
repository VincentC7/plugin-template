package fr.lordhydra.dummyPlugin.config;

import fr.lordhydra.dummyPlugin.services.FileService;
import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    public static void load() {
        FileConfiguration configuration = FileService.getInstance()
                .getFile("config").getConfig();
    }
}
