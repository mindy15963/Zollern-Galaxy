package zollerngalaxy.core;

import micdoodle8.mods.galacticraft.api.world.BiomeGenBaseGC;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import zollerngalaxy.biomes.ZGBiomes;
import zollerngalaxy.blocks.ZGBlocks;
import zollerngalaxy.blocks.fluids.ZGFluids;
import zollerngalaxy.compatibility.ZGCompats;
import zollerngalaxy.config.ConfigManagerZG;
import zollerngalaxy.core.dimensions.ZGDimensions;
import zollerngalaxy.creativetabs.ZGTabs;
import zollerngalaxy.events.ZGSoundEvents;
import zollerngalaxy.items.ZGItems;
import zollerngalaxy.lib.ZGInfo;
import zollerngalaxy.lib.helpers.ModHelperBase;
import zollerngalaxy.lib.helpers.ZGHandlers;
import zollerngalaxy.lib.helpers.ZGHelper;
import zollerngalaxy.mobs.MobRegistry;
import zollerngalaxy.network.teleporter.MessageTeleportToDimension;
import zollerngalaxy.planets.ZGPlanets;
import zollerngalaxy.planets.ZGSpaceStations;
import zollerngalaxy.proxy.CommonProxy;
import zollerngalaxy.proxy.IProxy;
import zollerngalaxy.recipes.ZGRecipeRegistry;
import zollerngalaxy.util.OreDictRegistry;
import zollerngalaxy.util.ZGLore;

@Mod(modid = ZGInfo.MOD_ID, version = ZGInfo.MOD_VERSION, name = ZGInfo.NAME, dependencies = ZGInfo.DEPENDENCIES)
public class ZollernGalaxyCore {
	
	@SidedProxy(clientSide = ZGInfo.PROXY_CLIENT, serverSide = ZGInfo.PROXY_SERVER)
	public static IProxy proxy;
	
	@Mod.Instance(ZGInfo.MOD_ID)
	private static ZollernGalaxyCore INSTANCE;
	
	// CHANGE THIS TO FALSE BEFORE DEPLOYMENT!!
	private static final boolean DEV_MODE = false;
	
	public static SimpleNetworkWrapper snw;
	
	public static ZollernGalaxyCore instance() {
		return INSTANCE;
	}
	
	/**
	 * If the mod is in Developer Mode, the JSON generators will run through
	 * every block, item, and recipe to re-generate them over the top of the
	 * current ones, as well as generate new ones.
	 * 
	 * @return Whether or not Developer Mode is active.
	 */
	public boolean isInDevMode() {
		return DEV_MODE;
	}
	
	static {
		FluidRegistry.enableUniversalBucket();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ZGHelper.Log("Beginning Pre-Initilization phase...");
		snw = NetworkRegistry.INSTANCE.newSimpleChannel(ZGInfo.CHANNEL);
		snw.registerMessage(MessageTeleportToDimension.TeleportHandler.class, MessageTeleportToDimension.class, 1,
				Side.SERVER);
		ConfigManagerZG.init(event);
		ZGSoundEvents.init();
		ModHelperBase.detectMods();
		ZGCompats.init();
		ZGInfo.init(event.getModMetadata());
		ZGLore.init();
		ZGItems.init();
		ZGBlocks.init();
		ZGFluids.init();
		ZGBiomes.init();
		ZGPlanets.init();
		ZGSpaceStations.init();
		OreDictRegistry.init();
		
		instance().proxy.registerPreRendering();
		instance().proxy.preInit(event);
		ZGHelper.Log("Pre-Init phase complete.");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		ZGHelper.Log("Beginning Initialization phase...");
		ZGTabs.init();
		ZGRecipeRegistry.init();
		ZGHandlers.init();
		
		for (BiomeGenBaseGC biome : ZGBiomes.biomeList) {
			biome.registerTypes(biome);
		}
		
		MobRegistry.init();
		
		instance().proxy.registerInitRendering();
		instance().proxy.init(event);
		
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonProxy());
		ZGHelper.Log("Init phase complete.");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		ZGHelper.Log("Beginning Post-Initialization phase...");
		ZGDimensions.init();
		
		instance().proxy.registerPostRendering();
		instance().proxy.postInit(event);
		ZGHelper.Log("Post-Init phase complete.");
	}
	
}