package dev.bleepo.antibackdoor;

import dev.bleepo.antibackdoor.events.DispenseIllegalItem;
import dev.bleepo.antibackdoor.events.Gamemode;
import dev.bleepo.antibackdoor.events.IllegalItemPlace;
import dev.bleepo.antibackdoor.events.IllegalStack;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiBackdoor extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.DARK_GREEN + "Loading Classes...");
        getServer().getPluginManager().registerEvents(new IllegalStack(this), this);
        getServer().getPluginManager().registerEvents(new IllegalItemPlace(this), this);
        getServer().getPluginManager().registerEvents(new DispenseIllegalItem(this), this);
        getServer().getPluginManager().registerEvents(new Gamemode(this), this);
        getLogger().info(ChatColor.DARK_GREEN + "Loading Config...");
        saveDefaultConfig();
        getLogger().info(ChatColor.DARK_GREEN + "AntiBackdoor by Bleepo has been loaded and enabled!");

    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.DARK_GREEN + "AntiBackdoor by Bleepo has been unloaded and disabled!");
    }
}
