package zollerngalaxy.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import zollerngalaxy.core.enums.EnumBlockType;
import zollerngalaxy.core.enums.EnumHarvestLevel;

public class ZGBlockDirt extends ZGBlockBase {
	
	public ZGBlockDirt(String blockName, float hardResist) {
		super(blockName, hardResist);
		this.setMaterial(Material.GROUND);
		this.setSoundType(SoundType.GROUND);
		this.setHarvestLevel("shovel", EnumHarvestLevel.IRON.getHarvestLevel());
		this.setBlockType(EnumBlockType.DIRT);
	}
	
	public ZGBlockDirt(String blockName) {
		this(blockName, 0.9F);
	}
	
	@Override
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
		return false;
	}
	
}