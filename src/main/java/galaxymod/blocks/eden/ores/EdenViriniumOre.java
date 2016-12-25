/*******************************************************************************
 * Copyright 2016 Zollern Wolf
 * - Zollern Galaxy
 * Galacticraft Add-On Mod
 * You CAN:
 * - Learn from it
 * - Use it to get ideas and concepts
 * You CAN'T:
 * - Redistribute it
 * - Claim it as your own
 * Steve Kung's "More Planets" mod was a big help.
 *******************************************************************************/

package galaxymod.blocks.eden.ores;

import galaxymod.blocks.BlockNovaOre;
import galaxymod.items.ItemList;
import java.util.Random;
import net.minecraft.item.Item;

public class EdenViriniumOre extends BlockNovaOre {
	
	public EdenViriniumOre() {
		super("edenviriore");
		this.setHardResist(2.0F, 6.0F);
		this.setExpDrop(9, 10);
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		return ItemList.rawViri;
	}
	
	@Override
	public int quantityDropped(Random p_149745_1_) {
		if (p_149745_1_.nextInt(10) == 2) {
			return 2;
		} else {
			return 1;
		}
	}
	
}