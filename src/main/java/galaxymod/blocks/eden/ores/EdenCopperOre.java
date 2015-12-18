package galaxymod.blocks.eden.ores;

import galaxymod.blocks.BlockNova;
import galaxymod.lib.ModInfo;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class EdenCopperOre extends BlockNova {
	public EdenCopperOre() {
		super(Material.rock);
		this.setBlockName(ModInfo.MODID + "_edencopperore");
		this.setBlockTextureName(ModInfo.MODID + ":edencopperore");
		this.setHardness(4.0F);
		this.setResistance(2.0F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	private Random rand = new Random();
	
	@Override
	public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_,
			int p_149690_7_) {
		if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item
				.getItemFromBlock(this)) {
			int j1 = 0;
			j1 = MathHelper.getRandomIntegerInRange(rand, 6, 11);
			
			return j1;
		}
		return 0;
	}
}