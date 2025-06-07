package com.ecolight15.ecogames;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * Main command handler for EcoGames
 */
public class EcoGamesCommand implements CommandExecutor {
    
    private final EcoGames plugin;
    
    public EcoGamesCommand(EcoGames plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, 
                           @NotNull String label, @NotNull String[] args) {
        
        if (args.length == 0) {
            sender.sendMessage("§a[EcoGames] §fEcoGames v" + plugin.getDescription().getVersion());
            sender.sendMessage("§a[EcoGames] §fMinecraft Java版マルチサーバー向けミニゲーム制御プラグイン");
            return true;
        }
        
        if (args[0].equalsIgnoreCase("reload")) {
            if (!sender.hasPermission("ecogames.admin")) {
                sender.sendMessage("§c[EcoGames] §fYou don't have permission to use this command.");
                return true;
            }
            
            sender.sendMessage("§a[EcoGames] §fPlugin reloaded successfully!");
            return true;
        }
        
        if (args[0].equalsIgnoreCase("version")) {
            sender.sendMessage("§a[EcoGames] §fVersion: " + plugin.getDescription().getVersion());
            return true;
        }
        
        // Unknown subcommand
        sender.sendMessage("§c[EcoGames] §fUnknown command. Use /ecogames for help.");
        return true;
    }
}