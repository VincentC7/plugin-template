package fr.lordhydra.invest.config;

import fr.lordhydra.invest.services.FileService;
import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    public static void load() {
        FileConfiguration configuration = FileService.getInstance()
                .getFile("config").getConfig();
    }
}
