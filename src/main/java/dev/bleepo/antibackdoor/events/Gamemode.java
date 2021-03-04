package dev.bleepo.antibackdoor.events;

import dev.bleepo.antibackdoor.AntiBackdoor;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class Gamemode implements Listener {
    private final AntiBackdoor plugin;


    public Gamemode(AntiBackdoor plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onGamemodeSwitch(PlayerGameModeChangeEvent e) {
        if (!e.getPlayer().isOp()) {
            e.getPlayer().setGameMode(GameMode.SURVIVAL);
            e.setCancelled(true);
            String message = plugin.getConfig().getString("");
            assert message != null;
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        }
    }
}
