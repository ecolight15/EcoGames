package org.bukkit.command;

/**
 * Minimal stub for CommandExecutor interface to allow compilation
 * In real usage, this would be provided by Bukkit/Spigot/Paper server
 */
public interface CommandExecutor {
    boolean onCommand(CommandSender sender, Command command, String label, String[] args);
}