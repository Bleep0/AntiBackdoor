package dev.bleepo.antibackdoor.events;

import dev.bleepo.antibackdoor.AntiBackdoor;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class IllegalItemPlace implements Listener {
    private final AntiBackdoor plugin;


    public IllegalItemPlace(AntiBackdoor plugin) {
        this.plugin = plugin;
    }

    public void onPlace(BlockPlaceEvent e) {
        Material itemType = e.getBlock().getType();

        if (itemType == Material.BEDROCK || itemType == Material.BARRIER || itemType == Material.SPAWNER || itemType == Material.COMMAND_BLOCK_MINECART || itemType == Material.COMMAND_BLOCK || itemType == Material.CHAIN_COMMAND_BLOCK || itemType == Material.REPEATING_COMMAND_BLOCK || itemType == Material.STRUCTURE_VOID) {
            e.setCancelled(true);
            String message = plugin.getConfig().getString("");
            assert message != null;
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        }
    }
}
