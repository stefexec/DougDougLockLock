package de.gurkenwerfer.locklock.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ChestListener implements Listener {

    @EventHandler
    public void onChestOpen(PlayerInteractEvent e) {

        String world = e.getPlayer().getWorld().getName();

        if (e.getClickedBlock().getType().toString().contains("CHEST") && !world.equals("smp") && !world.equals("smp_nether") && !world.equals("smp_the_end")) {
            e.setCancelled(true);
        }
    }
}
