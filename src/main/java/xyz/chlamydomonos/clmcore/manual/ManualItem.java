package xyz.chlamydomonos.clmcore.manual;

import net.minecraft.item.Item;
import xyz.chlamydomonos.clmcore.ChlamydomonosiaCore;
import xyz.chlamydomonos.clmcore.itemgroups.ChlamydomonosiaCoreItemGroups;

public class ManualItem extends Item
{
    public ManualItem()
    {
        super(new Properties().group(ChlamydomonosiaCoreItemGroups.CHLAMYDOMONOSIA));
        setRegistryName(ChlamydomonosiaCore.MODID, "manual");
    }
}
