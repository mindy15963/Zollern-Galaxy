package zollerngalaxy.core.dimensions;

import micdoodle8.mods.galacticraft.core.util.WorldUtil;
import net.minecraft.world.DimensionType;
import zollerngalaxy.config.ConfigManagerZG;

public class ZGDimensions {
	
	// Psion-6
	public static DimensionType ZOLLUS;
	public static DimensionType KRIFFON;
	public static DimensionType EDEN;
	public static DimensionType PURGOT;
	
	// Praedyth
	public static DimensionType OASIS;
	public static DimensionType XATHIUS;
	
	public static void init() {
		// Psion-6
		ZGDimensions.ZOLLUS = WorldUtil
				.getDimensionTypeById(ConfigManagerZG.planetZollusDimensionId);
		ZGDimensions.KRIFFON = WorldUtil
				.getDimensionTypeById(ConfigManagerZG.planetKriffonDimensionId);
		ZGDimensions.EDEN = WorldUtil
				.getDimensionTypeById(ConfigManagerZG.planetEdenDimensionId);
		ZGDimensions.PURGOT = WorldUtil
				.getDimensionTypeById(ConfigManagerZG.planetPurgotDimensionId);
		
		// Praedyth
		ZGDimensions.OASIS = WorldUtil
				.getDimensionTypeById(ConfigManagerZG.planetOasisDimensionId);
		ZGDimensions.XATHIUS = WorldUtil
				.getDimensionTypeById(ConfigManagerZG.planetXathiusDimensionId);
		
	}
}