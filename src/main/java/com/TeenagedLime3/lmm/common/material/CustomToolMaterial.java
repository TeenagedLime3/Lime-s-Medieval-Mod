package com.TeenagedLime3.lmm.common.material;

import com.TeenagedLime3.lmm.core.init.ItemInit;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import java.util.function.Supplier;

public enum CustomToolMaterial implements Tier {

    STEEL_TOOL(2,1000,7f,2.5f,7, () -> Ingredient.of(ItemInit.STEEL_INGOT.get().getDefaultInstance())),
    BRONZE_TOOL(2, 1000, 7f, 2.5f, 7, () -> Ingredient.of(ItemInit.STEEL_INGOT.get().getDefaultInstance()));


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    CustomToolMaterial( int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial.get();

    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.getLevel();
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.getRepairIngredient();
    }
}
