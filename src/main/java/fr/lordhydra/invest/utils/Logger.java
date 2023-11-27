package fr.lordhydra.invest.utils;

import fr.lordhydra.invest.Invest;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class Logger {

    private static Logger instance;
    private static JavaPlugin main;

    private Logger() {
        main = Invest.getInstance();
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void info(String message) {
        main.getLogger().log(Level.INFO, message);
    }

    public void error(String error) {
        main.getLogger().log(Level.SEVERE, error);
    }

    public void warning(String error) {
        main.getLogger().log(Level.WARNING, error);
    }
}
