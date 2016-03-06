package me.robozeri;

import me.robozeri.commands.ArenaCommand;
import me.robozeri.commands.ClanCommand;
import me.robozeri.commands.CardCommand;
import me.robozeri.commands.RoyaleCommand;
import me.robozeri.commands.ShopCommand;
import me.robozeri.lib.database;

import org.bukkit.plugin.java.JavaPlugin;
/**
  _______         __   ___                 __   
 / ___/ /__ ____ / /  / _ \___  __ _____ _/ /__ 
/ /__/ / _ `(_-</ _ \/ , _/ _ \/ // / _ `/ / -_)
\___/_/\_,_/___/_//_/_/|_|\___/\_, /\_,_/_/\__/ 
 */
public class ClashRoyale extends JavaPlugin{
  
  public void onEnable(){
    
    getLogger().info("ClashRoyale è stato avviato.");
  }
  public void onDisable(){
    
    getLogger().info("ClashRoyale è stato disabilitato.");
    
  }
  
}
