package nogrief;

import org.bukkit.Bukkit;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.entity.Enderman;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public final class ExplosionListener implements Listener {

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event) {
        if (event.getEntity() instanceof Creeper) {
            // Bukkit.getLogger().info("[NoGrief] Blocked creeper explosion");
            event.blockList().clear(); // no block destruction, explosion still happens
        }
    }

    @EventHandler
    public void onEndermanChangeBlock(EntityChangeBlockEvent event) {
        if (event.getEntity() instanceof Enderman) {
            // Bukkit.getLogger().info("[NoGrief] Blocked enderman block pickup");
            event.setCancelled(true);
        }
    }
}
