package zollerngalaxy.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import zollerngalaxy.blocks.ZGBlocks;
import zollerngalaxy.items.ZGItems;

public class OreDictRegistry {
	
	public static void init() {
		// Copper
		registerOre("oreCopper", ZGBlocks.edenCopperOre, ZGBlocks.kriffCopperOre, ZGBlocks.purgCopperOre,
				ZGBlocks.zolCopperOre, ZGBlocks.xantheonCopperOre);
		
		// Tin
		registerOre("oreTin", ZGBlocks.edenTinOre, ZGBlocks.purgTinOre, ZGBlocks.zolTinOre, ZGBlocks.xathTinOre,
				ZGBlocks.oasisTinOre);
		
		// Lead
		registerOre("oreLead", ZGBlocks.edenLeadOre, ZGBlocks.purgLeadOre, ZGBlocks.oasisLeadOre);
		
		// Silver
		registerOre("oreSilver", ZGBlocks.edenSilverOre);
		
		// Lapis
		registerOre("oreLapis", ZGBlocks.edenLapisOre);
		
		// Dirt
		registerOre("dirt", ZGBlocks.edenSoil, ZGBlocks.kriffDirt, ZGBlocks.purgDirt, ZGBlocks.zolDirt, ZGBlocks.xathDirt,
				ZGBlocks.oasisDirt);
		
		// Gravel
		registerOre("gravel", ZGBlocks.edenGravel, ZGBlocks.purgGravel, ZGBlocks.xathGravel, ZGBlocks.oasisGravel);
		
		// Grass
		registerOre("grass", ZGBlocks.edenGoldenGrass, ZGBlocks.edenGrass, ZGBlocks.edenSwampGrass, ZGBlocks.xathGrass,
				ZGBlocks.oasisGrass);
		
		// Logs
		registerOre("logWood", ZGBlocks.edenWoodLog);
		
		// Leaves
		registerOre("treeLeaves", ZGBlocks.edenWoodLeaves);
		
		// Saplings
		registerOre("treeSapling", ZGBlocks.edenWoodSapling);
		
		// Planks
		registerOre("plankWood", ZGBlocks.edenWoodPlanks);
		
		// Stone
		registerOre("stone", ZGBlocks.edenStone, ZGBlocks.kriffStone, ZGBlocks.purgStone, ZGBlocks.zolStone,
				ZGBlocks.xathStone, ZGBlocks.oasisStone, ZGBlocks.xantheonStone);
		
		// Stone Bricks
		registerOre("stonebrick", ZGBlocks.edenRockBricks, ZGBlocks.kriffRockBricks, ZGBlocks.purgRockBricks,
				ZGBlocks.zolRockBricks, ZGBlocks.xathRockBricks, ZGBlocks.oasisRockBricks,
				ZGBlocks.blockShinestoneCrystalBricks);
		
		// Glowstone
		registerOre("glowstone", ZGBlocks.edenBrightStone, ZGBlocks.blockShinestone);
		
		// Sand
		registerOre("sand", ZGBlocks.edenBloodSand);
		
		// Cobble
		registerOre("cobblestone", ZGBlocks.edenCobbleRock, ZGBlocks.kriffCobbleRock, ZGBlocks.purgCobbleRock,
				ZGBlocks.zolCobbleRock, ZGBlocks.xathCobble, ZGBlocks.oasisCobble);
		
		// Coal
		registerOre("oreCoal", ZGBlocks.edenCoalOre, ZGBlocks.kriffCoalOre, ZGBlocks.zolCoalOre, ZGBlocks.oasisCoalOre,
				ZGBlocks.xantheonCoalOre);
		
		// Iron
		registerOre("oreIron", ZGBlocks.edenIronOre, ZGBlocks.kriffIronOre, ZGBlocks.purgIronOre, ZGBlocks.zolIronOre,
				ZGBlocks.xathIronOre, ZGBlocks.oasisIronOre, ZGBlocks.xantheonIronOre);
		
		// Gold
		registerOre("oreGold", ZGBlocks.edenGoldOre, ZGBlocks.kriffGoldOre, ZGBlocks.purgGoldOre, ZGBlocks.zolGoldOre,
				ZGBlocks.xathGoldOre, ZGBlocks.oasisGoldOre);
		
		// Nickel
		registerOre("oreNickel", ZGBlocks.edenNickelOre, ZGBlocks.xantheonNickelOre);
		
		// Diamond
		registerOre("oreDiamond", ZGBlocks.edenDiamondOre, ZGBlocks.purgDiamondOre, ZGBlocks.xathDiamondOre,
				ZGBlocks.oasisDiamondOre);
		registerOre("dustDiamond", ZGItems.dustDiamond);
		
		// Emerald
		registerOre("oreEmerald", ZGBlocks.edenEmeraldOre, ZGBlocks.purgEmeraldOre, ZGBlocks.xathEmeraldOre);
		registerOre("dustEmerald", ZGItems.dustEmerald);
		
		// Redstone
		registerOre("oreRedstone", ZGBlocks.edenRedstoneOre, ZGBlocks.kriffRedstoneOre, ZGBlocks.purgRedstoneOre,
				ZGBlocks.xathRedstoneOre, ZGBlocks.oasisRedstoneOre);
		
		// Steel
		registerOre("oreSteel", ZGBlocks.edenSteelOre);
		
		// Platinum
		registerOre("orePlatinum", ZGBlocks.edenPlatinumOre);
		registerOre("dustPlatinum", ZGItems.dustShinium);
		registerOre("ingotPlatinum", ZGItems.ingotShinium);
		registerOre("blockPlatinum", ZGBlocks.blockShinium);
		
		// Shinium
		registerOre("dustShinium", ZGItems.dustShinium);
		registerOre("ingotShinium", ZGItems.ingotShinium);
		registerOre("blockShinium", ZGBlocks.blockShinium);
		
		// Chargium
		registerOre("dustChargium", ZGItems.dustChargium);
		registerOre("ingotChargium", ZGItems.ingotChargium);
		registerOre("blockChargium", ZGBlocks.blockChargium);
		
		// Shinestone
		registerOre("dustShinestone", ZGItems.dustShinestone);
		registerOre("ingotShinestone", ZGItems.ingotShinestone);
		registerOre("blockShinestone", ZGBlocks.blockShinestone);
		
		// Electrum
		registerOre("oreElectrum", ZGBlocks.edenElectrumOre);
		
		// Invar
		registerOre("oreInvar", ZGBlocks.edenInvarOre);
		
		// Bronze
		registerOre("oreBronze", ZGBlocks.edenBronzeOre);
		
		// Desh
		registerOre("oreDesh", ZGBlocks.edenDeshOre);
		
		// Meteoric Iron
		registerOre("oreMeteoricIron", ZGBlocks.edenMeteoricIronOre, ZGBlocks.purgMeteoricIronOre);
		
		// Aluminum
		registerOre("oreAluminum", ZGBlocks.edenAluminumOre, ZGBlocks.purgAluminumOre);
		
		// Heartium
		registerOre("oreHeartium", ZGBlocks.edenHeartiumOre, ZGBlocks.zolHeartOre);
		registerOre("gemHeartium", ZGItems.heartOfZol);
		
		// Cobalt
		registerOre("oreCobalt", ZGBlocks.edenCobaltOre, ZGBlocks.kriffCobaltOre, ZGBlocks.purgCobaltOre);
		registerOre("dustCobalt", ZGItems.dustCobalt);
		registerOre("ingotCobalt", ZGItems.ingotCobalt);
		registerOre("blockCobalt", ZGBlocks.blockCobalt);
		registerOre("pickaxeCobalt", ZGItems.pickaxeCobalt);
		
		// Evenium
		registerOre("oreEvenium", ZGBlocks.edenEveniumOre, ZGBlocks.purgEveniumOre);
		registerOre("dustEvenium", ZGItems.dustEvenium);
		registerOre("ingotEvenium", ZGItems.ingotEvenium);
		registerOre("blockEvenium", ZGBlocks.blockEve);
		registerOre("pickaxeEvenium", ZGItems.pickaxeVirinium);
		
		// Virinium
		registerOre("oreVirinium", ZGBlocks.edenViriniumOre);
		registerOre("dustVirinium", ZGItems.dustVirinium);
		registerOre("ingotVirinium", ZGItems.ingotVirinium);
		registerOre("blockVirinium", ZGBlocks.blockViri);
		registerOre("pickaxeVirinium", ZGItems.pickaxeVirinium);
		
		// Promethean
		registerOre("orePromethean", ZGBlocks.xathPrometheanOre);
		registerOre("gemPromethean", ZGItems.prometheanCrystal);
		registerOre("blockPromethean", ZGBlocks.blockPromethean);
		
		// Super Charged Coal
		registerOre("oreSuperChargedCoal", ZGBlocks.oasisSuperChargedCoalOre);
		registerOre("gemSuperChargedCoal", ZGItems.superChargedCoal);
		registerOre("blockSuperChargedCoal", ZGBlocks.blockSuperChargedCoal);
		
		// Plutonium
		registerOre("orePlutonium", ZGBlocks.xantheonPlutoniumOre);
		registerOre("gemPlutonium", ZGItems.plutoniumCrystal);
		registerOre("blockPlutonium", ZGBlocks.blockPlutonium);
	}
	
	private static void registerOre(String strName, Item... items) {
		for (Item i : items) {
			OreDictionary.registerOre(strName, i);
		}
	}
	
	private static void registerOre(String strName, Block... blocks) {
		for (Block b : blocks) {
			OreDictionary.registerOre(strName, b);
		}
	}
}