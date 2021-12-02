package xyz.chlamydomonos.clmcore.loaders;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xyz.chlamydomonos.clmcore.ChlamydomonosiaCore;
import xyz.chlamydomonos.clmcore.manual.ManualItem;

@Mod.EventBusSubscriber(modid = ChlamydomonosiaCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemLoader
{
    public static final Item MANUAL = new ManualItem();

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
            MANUAL
        );
    }
}
