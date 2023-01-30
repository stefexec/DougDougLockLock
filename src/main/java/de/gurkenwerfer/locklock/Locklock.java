package de.gurkenwerfer.locklock;

import de.gurkenwerfer.locklock.Listeners.ChestListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Locklock extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ChestListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
