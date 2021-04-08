package net.alphaplace.sf;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockHandler extends BlockListener
{
    public void onBlockPlace(BlockPlaceEvent event)
    {
        Block placed = event.getBlockPlaced();
        Location pLoc = placed.getLocation();
        if (placed.getType() == Material.CROPS)
        {
            Location above = new Location(pLoc.getWorld(), pLoc.getBlockX(), pLoc.getBlockY(), pLoc.getBlockZ());
            if (above.getBlock().getType() != Material.AIR)
            {
                event.getPlayer().sendMessage(ChatColor.RED + "Block obstructed!");
                event.setCancelled(true);
                event.setBuild(false);
                return;
            }
        }
    }
}
