package com.renzaifei.litd;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(LostInTheDeep.MODID)
public class LostInTheDeep {
    public static final String MODID = "lostinthedeep";
    public static final Logger LOGGER = LogUtils.getLogger();
    public LostInTheDeep(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info(">_<");
    }
}
