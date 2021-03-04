package dev.bleepo.antibackdoor.events;

import dev.bleepo.antibackdoor.AntiBackdoor;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.ItemStack;

public class IllegalStack implements Listener {
    private final AntiBackdoor plugin;


    public IllegalStack(AntiBackdoor plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onInventoryOpen(InventoryMoveItemEvent e) {
        ItemStack = e.getItem().getType();
        if (item.getAmount() > item.getMaxStackSize()) {
            item.setAmount(item.getMaxStackSize());
            String message = plugin.getConfig().getString("");
            assert message != null;
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        }
    }
}
