package net.alphaplace.sf;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;

public class PlayerHandler extends PlayerListener
{
    public void onPlayerInteract(PlayerInteractEvent event)
    {
        if (event.getClickedBlock().getType() == Material.SOIL &&
            event.getPlayer().getItemInHand().getType() == Material.SEEDS &&
            event.getBlockFace() == BlockFace.UP)
        {
            Location above = event.getClickedBlock().getLocation().add(0, 1, 0);
            if (above.getBlock().getType() != Material.AIR)
            {
                event.getPlayer().sendMessage(ChatColor.RED + "Block obstructed!");
                event.setCancelled(true);
            }
        }
    }
}
