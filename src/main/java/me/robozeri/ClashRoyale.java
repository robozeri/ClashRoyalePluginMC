package me.robozeri;

import me.robozeri.commands.ArenaCommand;
import me.robozeri.commands.ClanCommand;
import me.robozeri.commands.CardCommand;
import me.robozeri.commands.RoyaleCommand;
import me.robozeri.commands.ShopCommand;
import me.robozeri.lib.database;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.plugin.java.JavaPlugin;
/**
  _______         __   ___                 __   
 / ___/ /__ ____ / /  / _ \___  __ _____ _/ /__ 
/ /__/ / _ `(_-</ _ \/ , _/ _ \/ // / _ `/ / -_)
\___/_/\_,_/___/_//_/_/|_|\___/\_, /\_,_/_/\__/ 
 */
public class ClashRoyale extends JavaPlugin{
  //instanzia oggetto
  private database database;
  private database DEBUG_DATABASE;
  // inserisci dati del tuo databse SQL.
  private final static String DATABSE_NAME = "ciao";
  private final static String DATABSE_USER = "ciao";
  private final static String DATABSE_PASSWORD = "ciao";
  
  
  // IP AND PORT 
  
  private final static String DATABSE_HOST = "ciao";
  // default port
  private final static int DATABASE_PORT = "1433"

  public void onEnable(){
    
    getLogger().info("ClashRoyale è stato avviato.");
    this.getCommand("arena").setExecutor(new ArenaCommand());
    this.getCommand("royale").setExecutor(new RoyaleCommand());
    this.getCommand("clan").setExecutor(new ClanCommand());
    this.getCommand("shop").setExecutor(new ArenaCommand());
    this.getCommand("money").setExecutor(new RoyaleCommand());
    this.getCommand("info").setExecutor(new ClanCommand());
    
    
  }
  public void onDisable(){
    
    getLogger().info("ClashRoyale è stato disabilitato.");
    
  }
  private void ConnectSql(){
    
    
  }
  private void registerListeners() {
      
  }

  
}
