/*    */ package de.cragus.bungeejoin.listener;
/*    */ 
/*    */ import de.cragus.bungeejoin.bungeejoin;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.EventPriority;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerLoginEvent;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ public class PlayerListener implements Listener {
/*    */   bungeejoin plugin;
/*    */   
/*    */   public PlayerListener(bungeejoin plugin) {
/* 14 */     this.plugin = plugin;
/* 15 */     plugin.getServer().getPluginManager().registerEvents(this, (Plugin)plugin);
/*    */   }
/*    */   
/*    */   @EventHandler(priority = EventPriority.HIGHEST)
/*    */   public void onPlayerLogin(PlayerLoginEvent event) {
/* 20 */     if (!event.getAddress().getHostAddress().equals(this.plugin.getConfig().getString("settings.proxyIP")))
/* 21 */       event.disallow(PlayerLoginEvent.Result.KICK_OTHER, this.plugin.getConfig().getString("settings.playerKickMessage").replaceAll("&", "§")); 
/*    */   }
/*    */ }