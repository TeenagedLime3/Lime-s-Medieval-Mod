package com.TeenagedLime3.lmm.core.init;

import com.TeenagedLime3.lmm.LimesMedievalMod;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LimesMedievalMod.MOD_ID);

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> BRONZE_COIN = ITEMS.register("bronze_coin", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> STEEL_BLEND = ITEMS.register("steel_blend", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));



    //Block Item
    public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS.register("steel_block", ()-> new BlockItem(BlockInit.STEEL_BLOCK.get(), new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", ()-> new BlockItem(BlockInit.TIN_BLOCK.get(), new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", ()-> new BlockItem(BlockInit.BRONZE_BLOCK.get(), new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));
    public static final RegistryObject<BlockItem> SILVER_BLOCK = ITEMS.register("silver_block", ()-> new BlockItem(BlockInit.SILVER_BLOCK.get(), new Item.Properties().tab(LimesMedievalMod.LMM_GROUP)));



}


