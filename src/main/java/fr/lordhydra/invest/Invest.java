package fr.lordhydra.invest;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Invest extends JavaPlugin {

    @Getter
    @Setter
    private static JavaPlugin instance;

    @Override
    public void onEnable() {
        setInstance(this);
        getLogger().info("started");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
