package com.vanilla.experience.forge.zerotickunpatch.override;

import net.minecraft.block.BlockState;
import net.minecraft.block.TwistingVinesTopBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class ZeroTickTwistingVinesTopBlock extends TwistingVinesTopBlock {
    public ZeroTickTwistingVinesTopBlock(Properties properties) {
        super(properties);
    }
    @Override
    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if(!worldIn.isAirBlock(pos.down())) {
            this.randomTick(state, worldIn, pos, rand);
        }
        super.tick(state, worldIn, pos, rand);
    }
}