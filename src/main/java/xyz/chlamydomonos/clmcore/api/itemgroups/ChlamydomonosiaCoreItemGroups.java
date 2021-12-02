package xyz.chlamydomonos.clmcore.api.itemgroups;

import net.minecraft.item.ItemGroup;

public class ChlamydomonosiaCoreItemGroups
{
    public static ItemGroup CHLAMYDOMONOSIA;

    static
    {
        try
        {
            Class<?> chlamydomonosiaCoreItemGroups = Class.forName("xyz.chlamydomonos.clmcore.itemgroups.ChlamydomonosiaCoreItemGroups");

            CHLAMYDOMONOSIA = (ItemGroup) chlamydomonosiaCoreItemGroups.getField("CHLAMYDOMONOSIA").get(null);
        }
        catch (Exception e)
        {
            throw new RuntimeException("ChlamydomonosiaCore not found");
        }
    }
}
