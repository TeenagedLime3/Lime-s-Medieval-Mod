package com.TeenagedLime3.lmm.core.init;

import com.TeenagedLime3.lmm.LimesMedievalMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LimesMedievalMod.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .harvestLevel(2)
            .strength(6f, 10f)
            .harvestTool(ToolType.PICKAXE)
            .sound(SoundType.METAL)));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .harvestLevel(2)
            .strength(3f, 5f)
            .harvestTool(ToolType.PICKAXE)
            .sound(SoundType.METAL)));
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .harvestLevel(2)
            .strength(4f, 7f)
            .harvestTool(ToolType.PICKAXE)
            .sound(SoundType.METAL)));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .harvestLevel(2)
            .strength(4f, 7f)
            .harvestTool(ToolType.PICKAXE)
            .sound(SoundType.METAL)));

}
