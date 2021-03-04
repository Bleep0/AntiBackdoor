package dev.bleepo.antibackdoor.events;

import dev.bleepo.antibackdoor.AntiBackdoor;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

public class DispenseIllegalItem implements Listener {
    private final AntiBackdoor plugin;


    public DispenseIllegalItem(AntiBackdoor plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDispense(BlockDispenseEvent e) {
        Material blockType = e.getBlock().getType();
        Material itemType = e.getItem().getType();

        if (blockType == Material.DISPENSER || blockType == Material.DROPPER) {
            if (itemType == Material.BEDROCK || itemType == Material.BARRIER || itemType == Material.SPAWNER || itemType == Material.COMMAND_BLOCK_MINECART || itemType == Material.COMMAND_BLOCK || itemType == Material.CHAIN_COMMAND_BLOCK || itemType == Material.REPEATING_COMMAND_BLOCK || itemType == Material.STRUCTURE_VOID) {
                e.setCancelled(true);
            }
        }
    }
}
