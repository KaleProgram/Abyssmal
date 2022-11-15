package com.kale.Abyssmal.registry.blocks


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public TransBlock extends Block
{
  public static final String NAME = "Transmogification block";
  private static final String UNLOCALIZED_NAME = "TransBlock";
  private static final String REGISTRY_NAME = "TransBlock_registry";





  public TransBlock()
  {
    Super(Material.ROCK);
    
    
    this.setCreativeTab(CreativeTab.BUILDING_BLOCKS);
    
    this.setUnlocalizedName(UNLOCALIZED_NAME);
    this.setRegistryName(REGISTRY_NAME);
  }
  
  
  @SideOnly (Side.Client)
  public BlockRenderLayer getBlockLayer()
  {
    return BlockRenderLayer.SOLID;
  }
  
  public onBlockDestroyedByPlayer()
  {
    
  }



}
