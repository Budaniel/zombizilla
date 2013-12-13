package io.github.Budaniel.zombizilla;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Zombizilla extends JavaPlugin implements Listener {
	
  public void onEnable() {
	  PluginManager pm = getServer().getPluginManager();
	  pm.registerEvents(this, this);
          
  }
     
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	Player targetPlayer = (Player) sender;
	if (cmd.getName().equalsIgnoreCase("callzombizilla")); {
		Location location = targetPlayer.getLocation();
		targetPlayer.getWorld().spawnEntity(location, EntityType.GIANT);
		return true;
		
	}
	
}
}
  
  
  
  
