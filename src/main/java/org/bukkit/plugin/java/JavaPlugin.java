package org.bukkit.plugin.java;

import java.util.logging.Logger;

/**
 * Minimal stub for JavaPlugin to allow compilation
 * In real usage, this would be provided by Bukkit/Spigot/Paper server
 */
public abstract class JavaPlugin {
    
    public void onEnable() {}
    
    public void onDisable() {}
    
    public Logger getLogger() {
        return Logger.getLogger(this.getClass().getName());
    }
    
    public PluginDescription getDescription() {
        return new PluginDescription();
    }
    
    public PluginCommand getCommand(String name) {
        return new PluginCommand();
    }
    
    public static class PluginDescription {
        public String getVersion() {
            return "1.0.0-SNAPSHOT";
        }
    }
    
    public static class PluginCommand {
        public void setExecutor(Object executor) {
            // Stub method
        }
    }
}