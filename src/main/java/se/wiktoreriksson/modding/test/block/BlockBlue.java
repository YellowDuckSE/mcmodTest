/*
MIT License

Copyright (c) 2018 Yellow Duck / Wiktor Eriksson

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
 */
package se.wiktoreriksson.modding.test.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

public class BlockBlue extends Block {
    private static BlockBlue blockblueObj=null;
    public BlockBlue() {
        super(Material.ROCK);
        setLightLevel(15/16f);
        setCreativeTab(CreativeTabs.MISC);
        setBlockUnbreakable();
        setRegistryName("test:blue_block");
        setUnlocalizedName("blue");
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     *
     * @param state state
     * @param worldIn worldIn
     * @param pos pos
     */
    @Override @Nonnull
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return MapColor.BLUE;
    }

    public static BlockBlue getRegistryBlock() {
        if (blockblueObj==null) blockblueObj=new BlockBlue();
        return blockblueObj;
    }

    @Override @Nonnull
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.SOLID;
    }

    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     *
     * @param state state
     */
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
