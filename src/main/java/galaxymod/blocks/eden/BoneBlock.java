/*******************************************************************************
 * Copyright 2015 Zollern Wolf - Project Nova / Nova Galactic Final Frontier
 * Galacticraft Add-On Mod You CAN: - Learn from it - Use it to get ideas and
 * concepts You CAN'T: - Redistribute it - Claim it as your own
 ******************************************************************************/

package galaxymod.blocks.eden;

import galaxymod.blocks.BlockNova;
import galaxymod.lib.NGHelper;
import net.minecraft.block.material.Material;

public class BoneBlock extends BlockNova {
	public BoneBlock() {
		super(Material.rock);
		NGHelper.setNameAndTexture(this, "bonestone");
		this.setResistance(2F);
		this.setHardness(2F);
		
	}
}