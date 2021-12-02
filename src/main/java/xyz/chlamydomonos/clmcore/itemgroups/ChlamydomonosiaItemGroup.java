package xyz.chlamydomonos.clmcore.itemgroups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xyz.chlamydomonos.clmcore.loaders.ItemLoader;

public class ChlamydomonosiaItemGroup extends ItemGroup
{
    public ChlamydomonosiaItemGroup()
    {
        super("chlamydomonosia");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemLoader.MANUAL);
    }
}
