package org.bukkit.command;

/**
 * Minimal stub for CommandSender interface to allow compilation
 * In real usage, this would be provided by Bukkit/Spigot/Paper server
 */
public interface CommandSender {
    void sendMessage(String message);
    boolean hasPermission(String permission);
}