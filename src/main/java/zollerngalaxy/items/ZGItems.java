package zollerngalaxy.items;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import zollerngalaxy.items.food.IceCream;
import zollerngalaxy.items.food.ItemSweetFood;
import zollerngalaxy.items.food.ZGItemFood;
import zollerngalaxy.items.tools.ItemOmnitool;
import zollerngalaxy.items.tools.ZGItemAxe;
import zollerngalaxy.items.tools.ZGItemHoe;
import zollerngalaxy.items.tools.ZGItemPickaxe;
import zollerngalaxy.items.tools.ZGItemShovel;
import zollerngalaxy.items.tools.ZGItemSword;
import zollerngalaxy.items.tools.ZGToolMats;
import zollerngalaxy.lib.helpers.CommonZGRegisterHelper;
import zollerngalaxy.lib.helpers.ZGHelper;

public class ZGItems {
	
	private static int totalItems = 0;
	
	public static final Item heartium = new ZGItemBase("heartofzol");
	public static final Item zolCrystal = new ZGItemBase("zolluscrystal");
	public static final Item kriffCrystal = new ZGItemBase("kriffoncrystal");
	public static final Item purgCrystal = new ZGItemBase("purgotcrystal");
	public static final Item edenCrystal = new ZGItemBase("edencrystal");
	public static final Item purgEssence = new ZGItemBase("purgotessence");
	public static final Item prometheanCrystal = new ZGItemBase("prometheancrystal");
	public static final Item plutoniumCrystal = new ZGItemBase("plutoniumcrystal");
	public static final Item azurite = new ZGItemBase("azurite");
	public static final Item ascendium = new ZGItemBase("ascendium");
	
	public static final Item dustVirinium = new ZGItemBase("rawviri");
	public static final Item dustCobalt = new ZGItemBase("cobaltdust");
	public static final Item dustEvenium = new ZGItemBase("eveniumdust");
	public static final Item dustFueltonium = new ZGItemBase("fueltoniumraw");
	public static final Item dustDiamond = new ZGItemBase("diamonddust");
	public static final Item dustEmerald = new ZGItemBase("emeralddust");
	public static final Item dustBrightstone = new ZGItemBase("brightstonedust");
	public static final Item dustShinestone = new ZGItemBase("shinestonedust");
	public static final Item dustShinium = new ZGItemBase("shiniumdust");
	public static final Item dustChargium = new ZGItemBase("chargiumdust");
	public static final Item dustAmaranth = new ZGItemBase("amaranthdust");
	public static final Item dustZollernium = new ZGItemBase("zollerniumdust");
	public static final Item dustZinc = new ZGItemBase("zincdust");
	
	public static final Item ingotVirinium = new ZGItemBase("ingotviri");
	public static final Item ingotCobalt = new ZGItemBase("ingotcobalt");
	public static final Item ingotEvenium = new ZGItemBase("ingotevenium");
	public static final Item ingotFueltonium = new ZGItemBase("fueltoniumingot");
	public static final Item ingotShinestone = new ZGItemBase("shinestoneingot");
	public static final Item ingotShinium = new ZGItemBase("shiniumingot");
	public static final Item ingotChargium = new ZGItemBase("chargiumingot");
	public static final Item ingotLapis = new ZGItemBase("lapisingot");
	public static final Item ingotAmaranth = new ZGItemBase("amaranthingot");
	public static final Item ingotAscendantAmaranth = new ZGItemBase("ascendantamaranthingot");
	public static final Item ingotZollernium = new ZGItemBase("zollerniumingot");
	public static final Item ingotZinc = new ZGItemBase("zincingot");
	
	public static final Item hud = new ItemHUD();
	public static final Item alienStone = new ZGItemBase("alienstone");
	
	public static final Item superChargedCoal = new ItemFuelBase("superchargedcoal", 6400);
	public static final Item powerStick = new ZGItemBase("powerstick");
	
	public static final Item compressedCobalt = new ZGItemBase("compressedcobalt");
	public static final Item compressedDiamond = new ZGItemBase("compresseddiamond");
	public static final Item compressedEmerald = new ZGItemBase("compressedemerald");
	public static final Item compressedEvenium = new ZGItemBase("compressedevenium");
	public static final Item compressedGold = new ZGItemBase("compressedgold");
	public static final Item compressedHeartium = new ZGItemBase("compressedheartium");
	public static final Item compressedKriffonium = new ZGItemBase("compressedkriffonium");
	public static final Item compressedVirinium = new ZGItemBase("compressedvirinium");
	public static final Item compressedVyrex = new ZGItemBase("compressedvyrex");
	public static final Item compressedPromethean = new ZGItemBase("compressedpromethean");
	public static final Item compressedSuperChargedCoal = new ZGItemBase("compressedsuperchargedcoal");
	public static final Item compressedRiven = new ZGItemBase("compressedriven");
	public static final Item compressedAmaranth = new ZGItemBase("compressedamaranth");
	public static final Item compressedAzurite = new ZGItemBase("compressedazurite");
	public static final Item compressedZollernium = new ZGItemBase("compressedzollernium");
	
	public static final Item rawAlienBacon = new ZGItemFood("alienbaconraw", 2, 1.5F, true);
	public static final Item rawAlienBeef = new ZGItemFood("alienbeefraw", 2, 1.5F, true);
	public static final Item cookedAlienBacon = new ZGItemFood("alienbaconcooked", 6, 4.0F, true);
	public static final Item cookedAlienBeef = new ZGItemFood("alienbeefcooked", 6, 4.0F, true);
	public static final Item edenFruit = new ZGItemFood("fruitofeden", 4, 2.5F, false);
	
	public static final Item creamBall = new ZGItemBase("creamball");
	public static final Item chocolateRaw = new ZGItemBase("rawchocolate");
	public static final Item chocolateBar = new ItemSweetFood("chocolatebar", MobEffects.JUMP_BOOST);
	public static final Item brownie = new ItemSweetFood("brownie", MobEffects.RESISTANCE);
	public static final Item candyApple = new ItemSweetFood("candyapple", MobEffects.SPEED);
	public static final Item iceCreamSandwich = new ItemSweetFood("icecreamsandwich", MobEffects.STRENGTH);
	public static final Item iceCream = new IceCream();
	
	public static final Item edenDungeonKey = new ZGItemBase("edendungeonkey");
	
	public static final Item starGateTier1 = new ItemStargate(1);
	public static final Item starGateTier2 = new ItemStargate(2);
	public static final Item starGateTier3 = new ItemStargate(3);
	public static final Item starGateTier4 = new ItemStargate(4);
	public static final Item starGateTier5 = new ItemStargate(5);
	public static final Item starGateTier6 = new ItemStargate(6);
	public static final Item starGateTier7 = new ItemStargate(7);
	public static final Item starGateTier8 = new ItemStargate(8);
	public static final Item starGateTier9 = new ItemStargate(9);
	public static final Item starGateTier10 = new ItemStargate(10);
	public static final Item starGateCandy = new ItemStargate(918);
	
	// Tools
	public static final Item OMNITOOL = new ItemOmnitool();
	
	// Pickaxes
	public static final Item pickaxeCobalt = new ZGItemPickaxe("cobalt", ZGToolMats.COBALT);
	public static final Item pickaxeEvenium = new ZGItemPickaxe("evenium", ZGToolMats.EVENIUM);
	public static final Item pickaxeVirinium = new ZGItemPickaxe("virinium", ZGToolMats.VIRINIUM);
	public static final Item pickaxeAmaranth = new ZGItemPickaxe("amaranth", ZGToolMats.AMARANTH);
	public static final Item pickaxeAzurite = new ZGItemPickaxe("azurite", ZGToolMats.AZURITE);
	public static final Item pickaxeZollernium = new ZGItemPickaxe("zollernium", ZGToolMats.ZOLLERNIUM);
	
	// Shovels
	public static final Item shovelCobalt = new ZGItemShovel("cobalt", ZGToolMats.COBALT);
	public static final Item shovelEvenium = new ZGItemShovel("evenium", ZGToolMats.EVENIUM);
	public static final Item shovelVirinium = new ZGItemShovel("virinium", ZGToolMats.VIRINIUM);
	public static final Item shovelAmaranth = new ZGItemShovel("amaranth", ZGToolMats.AMARANTH);
	public static final Item shovelAzurite = new ZGItemShovel("azurite", ZGToolMats.AZURITE);
	public static final Item shovelZollernium = new ZGItemShovel("zollernium", ZGToolMats.ZOLLERNIUM);
	
	// Axes
	public static final Item axeCobalt = new ZGItemAxe("cobalt", ZGToolMats.COBALT);
	public static final Item axeEvenium = new ZGItemAxe("evenium", ZGToolMats.EVENIUM);
	public static final Item axeVirinium = new ZGItemAxe("virinium", ZGToolMats.VIRINIUM);
	public static final Item axeAmaranth = new ZGItemAxe("amaranth", ZGToolMats.AMARANTH);
	public static final Item axeAzurite = new ZGItemAxe("azurite", ZGToolMats.AZURITE);
	public static final Item axeZollernium = new ZGItemAxe("zollernium", ZGToolMats.ZOLLERNIUM);
	
	// Hoes
	public static final Item hoeCobalt = new ZGItemHoe("cobalt", ZGToolMats.COBALT);
	public static final Item hoeEvenium = new ZGItemHoe("evenium", ZGToolMats.EVENIUM);
	public static final Item hoeVirinium = new ZGItemHoe("virinium", ZGToolMats.VIRINIUM);
	public static final Item hoeAmaranth = new ZGItemHoe("amaranth", ZGToolMats.AMARANTH);
	public static final Item hoeAzurite = new ZGItemHoe("azurite", ZGToolMats.AZURITE);
	public static final Item hoeZollernium = new ZGItemHoe("zollernium", ZGToolMats.ZOLLERNIUM);
	
	// Swords
	public static final Item swordCobalt = new ZGItemSword("cobalt", ZGToolMats.COBALT);
	public static final Item swordEvenium = new ZGItemSword("evenium", ZGToolMats.EVENIUM);
	public static final Item swordVirinium = new ZGItemSword("virinium", ZGToolMats.VIRINIUM);
	public static final Item swordAmaranth = new ZGItemSword("amaranth", ZGToolMats.AMARANTH);
	public static final Item swordAzurite = new ZGItemSword("azurite", ZGToolMats.AZURITE);
	public static final Item swordZollernium = new ZGItemSword("zollernium", ZGToolMats.ZOLLERNIUM);
	
	public static void init() {
		ZGItems.registerItems(heartium, zolCrystal, kriffCrystal, purgCrystal, edenCrystal, purgEssence,
				prometheanCrystal, plutoniumCrystal, azurite, ascendium, dustBrightstone, dustShinestone, dustVirinium,
				dustEvenium, dustCobalt, dustFueltonium, dustShinium, dustChargium, dustDiamond, dustEmerald, dustAmaranth,
				dustZollernium, dustZinc, ingotVirinium, ingotCobalt, ingotEvenium, ingotShinestone, ingotShinium,
				ingotChargium, ingotFueltonium, ingotLapis, ingotAmaranth, ingotAscendantAmaranth, ingotZollernium,
				ingotZinc, hud, alienStone, compressedCobalt, compressedDiamond, compressedEmerald, compressedEvenium,
				compressedGold, compressedHeartium, compressedKriffonium, compressedVirinium, compressedVyrex,
				compressedPromethean, compressedSuperChargedCoal, compressedRiven, compressedAmaranth, compressedAzurite,
				compressedZollernium, rawAlienBacon, cookedAlienBacon, rawAlienBeef, cookedAlienBeef, edenFruit, creamBall,
				chocolateRaw, chocolateBar, brownie, candyApple, iceCreamSandwich, iceCream, edenDungeonKey,
				superChargedCoal, powerStick, starGateTier1, starGateTier2, starGateTier3, starGateTier4, starGateTier5,
				starGateTier6, starGateTier7, starGateTier8, starGateTier9, starGateTier10, starGateCandy, OMNITOOL,
				pickaxeCobalt, pickaxeEvenium, pickaxeVirinium, pickaxeAmaranth, pickaxeAzurite, pickaxeZollernium,
				shovelCobalt, shovelEvenium, shovelVirinium, shovelAmaranth, shovelAzurite, shovelZollernium, axeCobalt,
				axeEvenium, axeVirinium, axeAmaranth, axeAzurite, axeZollernium, hoeCobalt, hoeEvenium, hoeVirinium,
				hoeAmaranth, hoeAzurite, hoeZollernium, swordCobalt, swordEvenium, swordVirinium, swordAmaranth,
				swordAzurite, swordZollernium);
		ZGHelper.Log("Loaded a total of " + totalItems + " new items.");
	}
	
	private static void addItem(Item item) {
		CommonZGRegisterHelper.registerItem(item);
		totalItems++;
	}
	
	private static void registerItems(Item... items) {
		for (Item i : items) {
			ZGItems.addItem(i);
		}
	}
	
}