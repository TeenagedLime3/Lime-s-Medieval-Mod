package com.TeenagedLime3.lmm;

import com.TeenagedLime3.lmm.core.init.BlockInit;
import com.TeenagedLime3.lmm.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("lmm")
public class LimesMedievalMod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lmm";
    public static final CreativeModeTab LMM_GROUP = new LmmGroup("lmmgroup");


    public LimesMedievalMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup( final FMLCommonSetupEvent event ) {

    }

    static class LmmGroup extends CreativeModeTab {

        public LmmGroup( String label ) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.RAW_TIN.get().getDefaultInstance();
        }
    }
}
