package com.ecolight15.ecogames;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * EcoGames - Minecraft Java版マルチサーバー向けミニゲーム制御機能プラグイン
 */
public class EcoGames extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("EcoGames plugin has been enabled!");
        
        // Register commands
        getCommand("ecogames").setExecutor(new EcoGamesCommand(this));
        
        getLogger().info("EcoGames v" + getDescription().getVersion() + " loaded successfully!");
    }

    @Override
    public void onDisable() {
        getLogger().info("EcoGames plugin has been disabled!");
    }
}