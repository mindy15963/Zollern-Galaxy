package zollerngalaxy.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zollerngalaxy.core.ZollernGalaxyCore;
import zollerngalaxy.core.enums.EnumBlockType;
import zollerngalaxy.lib.helpers.json.JSONFactory;

public class ZGBlockGrass extends ZGBlockDirt implements IGrowable {
	
	protected Block blockDirt = ZGBlocks.edenSoil;
	protected Block blockTallGrass = ZGBlocks.edenTallGrass;
	
	public ZGBlockGrass(String blockName, float hardResist) {
		super(blockName, hardResist);
		this.setMaterial(Material.GRASS);
		this.setSoundType(SoundType.PLANT);
		this.setTickRandomly(true);
		this.setShouldJSONIgnore(true);
		this.setBlockType(EnumBlockType.GRASS);
		if (ZollernGalaxyCore.instance().isInDevMode()) {
			JSONFactory.registerGrassBlock(blockName, this.getDirtBlock().getUnlocalizedName().substring(5));
		}
	}
	
	public ZGBlockGrass(String blockName) {
		this(blockName, 1.4F);
	}
	
	public Block setDirtBlock(Block block) {
		this.blockDirt = block;
		return this;
	}
	
	public Block setTallGrassBlock(Block block) {
		this.blockTallGrass = block;
		return this;
	}
	
	public Block setDirtBlocks(Block dirtBlock, Block tallGrassBlock) {
		this.setDirtBlock(dirtBlock);
		this.setTallGrassBlock(tallGrassBlock);
		return this;
	}
	
	public Block getDirtBlock() {
		return this.blockDirt;
	}
	
	public Block getTallGrassBlock() {
		return this.blockTallGrass;
	}
	
	@Override
	public boolean shouldJSONIgnore() {
		return true;
	}
	
	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
		return true;
	}
	
	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return true;
	}
	
	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		BlockPos blockpos = pos.up();
		
		for (int i = 0; i < 128; ++i) {
			BlockPos blockpos1 = blockpos;
			int j = 0;
			
			if (this.getTallGrassBlock() != null) {
				while (true) {
					if (j >= i / 16) {
						if (worldIn.isAirBlock(blockpos1)) {
							if (rand.nextInt(8) == 0) {
								worldIn.getBiome(blockpos1).plantFlower(worldIn, rand, blockpos1);
							} else {
								ZGBlockTallGrass tallGrass = (ZGBlockTallGrass) this.getTallGrassBlock();
								IBlockState iblockstate1 = tallGrass.getDefaultState();
								
								if (tallGrass.canBlockStay(worldIn, blockpos1, iblockstate1)) {
									worldIn.setBlockState(blockpos1, iblockstate1, 3);
								}
							}
						}
						
						break;
					}
					
					blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2,
							rand.nextInt(3) - 1);
					
					if (worldIn.getBlockState(blockpos1.down()).getBlock() != this
							|| worldIn.getBlockState(blockpos1).isNormalCube()) {
						break;
					}
					
					++j;
				}
			}
		}
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote) {
			if (!worldIn.isAreaLoaded(pos, 3))
				return;
			if (worldIn.getLightFromNeighbors(pos.up()) < 4
					&& worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2) {
				worldIn.setBlockState(pos, this.getDirtBlock().getDefaultState());
			} else {
				if (worldIn.getLightFromNeighbors(pos.up()) >= 9) {
					for (int i = 0; i < 4; ++i) {
						BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
						
						if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos)) {
							return;
						}
						
						IBlockState iblockstate = worldIn.getBlockState(blockpos.up());
						IBlockState iblockstate1 = worldIn.getBlockState(blockpos);
						
						if (iblockstate1.getBlock() == this.getDirtBlock()
								&& worldIn.getLightFromNeighbors(blockpos.up()) >= 4
								&& iblockstate.getLightOpacity(worldIn, pos.up()) <= 2) {
							worldIn.setBlockState(blockpos, this.getDefaultState());
						}
					}
				}
			}
		}
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this.getDirtBlock());
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
}