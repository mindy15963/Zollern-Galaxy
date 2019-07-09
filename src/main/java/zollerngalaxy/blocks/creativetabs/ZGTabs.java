package zollerngalaxy.blocks.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import zollerngalaxy.blocks.ZGBlocks;
import zollerngalaxy.blocks.items.ZGItems;
import zollerngalaxy.lib.helpers.ZGHelper;

public class ZGTabs {
	
	public static CreativeTabs zgItemsTab;
	public static CreativeTabs zgBlocksTab;
	
	public static void init() {
		zgBlocksTab = ZGHelper.createCreativeTabs("ZollernGalaxyBlocks",
				new ItemStack(ZGBlocks.zolSurfaceRock));
		zgItemsTab = ZGHelper.createCreativeTabs("ZollernGalaxyItems",
				new ItemStack(ZGItems.ingotViri));
	}
}