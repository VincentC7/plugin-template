package fr.lordhydra.dummyPlugin;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

public final class DummyService extends JavaPlugin {

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
