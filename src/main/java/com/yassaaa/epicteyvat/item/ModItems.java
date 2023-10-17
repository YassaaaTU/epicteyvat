package com.yassaaa.epicteyvat.item;

import com.yassaaa.epicteyvat.EpicTeyvat;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EpicTeyvat.MOD_ID);

    public static final RegistryObject<Item> EPICTEYVATLOGO = ITEMS.register("epicteyvatlogo", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETRINE = ITEMS.register("ametrine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETRINE_INGOT = ITEMS.register("ametrine_ingot", () -> new Item(new Item.Properties()));
//    public static final RegistryObject<Item> ENGULFING_LIGHTNING = ITEMS.register("engulfing_lightning", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
