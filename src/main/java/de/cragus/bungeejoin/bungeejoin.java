/*    */ package de.cragus.bungeejoin;
/*    */ 
/*    */ import de.cragus.bungeejoin.listener.PlayerListener;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ 
/*    */ public class bungeejoin
/*    */   extends JavaPlugin
/*    */ {
/*    */   public PlayerListener playerListener;
/*    */   
/*    */   public void onEnable() {
/* 15 */     registerConfig();
/* 17 */     registerListener();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onDisable() {}
/*    */ 
/*    */   
/*    */   private void registerConfig() {
/* 26 */     getConfig().options().copyDefaults(true);
/* 27 */     saveDefaultConfig();
/*    */   }
/*    */
/*    */   
/*    */   private void registerListener() {
/* 35 */     this.playerListener = new PlayerListener(this);
/*    */   }
/*    */ }