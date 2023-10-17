package com.yassaaa.epicteyvat.item;

import com.yassaaa.epicteyvat.EpicTeyvat;
import com.yassaaa.epicteyvat.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicTeyvat.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EPIC_TEYVAT_TAB =
            CREATIVE_MODE_TABS.register("epic_teyvat_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EPICTEYVATLOGO.get()))
                    .title(Component.translatable("creativetab.epic_teyvat_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(new ItemStack(ModItems.AMETRINE.get()));
                        pOutput.accept(new ItemStack(ModItems.AMETRINE_INGOT.get()));
                        pOutput.accept(ModBlocks.AMETRINE_BLOCK.get());
                        pOutput.accept(ModBlocks.AMETRINE_ORE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
