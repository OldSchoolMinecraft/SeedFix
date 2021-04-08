package net.alphaplace.sf;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public class SeedFix extends JavaPlugin
{
    public void onEnable()
    {
        //getServer().getPluginManager().registerEvent(Event.Type.BLOCK_PLACE, new BlockHandler(), Event.Priority.Highest, this);
        getServer().getPluginManager().registerEvent(Event.Type.PLAYER_INTERACT, new PlayerHandler(), Event.Priority.Highest, this);

        System.out.println("SeedFix enabled.");
    }

    public void onDisable()
    {
        System.out.println("SeedFix disabled.");
    }
}
