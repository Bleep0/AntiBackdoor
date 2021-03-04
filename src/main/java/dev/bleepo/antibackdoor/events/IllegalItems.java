package dev.bleepo.antibackdoor.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;

public class IllegalItems implements Listener {
    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e) {
        Material itemType = e.getItem().getType();
            if (e.getInventory().contains(itemType == Material.BEDROCK || itemType == Material.BARRIER || itemType == Material.SPAWNER || itemType == Material.COMMAND_BLOCK_MINECART || itemType == Material.COMMAND_BLOCK || itemType == Material.CHAIN_COMMAND_BLOCK || itemType == Material.REPEATING_COMMAND_BLOCK || itemType == Material.STRUCTURE_VOID)) {

            }
        }
    }
}
