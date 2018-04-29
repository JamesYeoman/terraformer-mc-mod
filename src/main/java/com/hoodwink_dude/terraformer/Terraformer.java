package com.hoodwink_dude.terraformer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.hoodwink_dude.terraformer.utils.Constants.*;

@Mod(modid = MODID, useMetadata = true)
public class Terraformer {
	@SidedProxy(clientSide = PROXY_CLIENT, serverSide = PROXY_COMMON)
	public static CommonProxy proxy;
	
	@Mod.Instance
	public static Terraformer instance;
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	 public void preInit(FMLPreInitializationEvent e) {
		LOGGER.info("Starting Pre-initialisation handler...");
		proxy.preInit(e);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		LOGGER.info("Starting Initialisation handler...");
		proxy.init(e);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		LOGGER.info("Starting Post-initialisation handler...");
		proxy.postInit(e);
	}
	
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent e) {
		LOGGER.info("Starting Server-Starting handler...");
		proxy.serverStarting(e);
	}
	
	@Mod.EventHandler
	public void serverStopping(FMLServerStoppingEvent e) {
		LOGGER.info("Starting Server-Stopping handler...");
		proxy.serverStopping(e);
	}
}
