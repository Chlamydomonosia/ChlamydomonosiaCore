package xyz.chlamydomonos.clmcore.api;

public class ChlamydomonosiaCore
{
    public static String MODID;

    static
    {
        try
        {
            Class<?> chlamydomonosiaCore = Class.forName("xyz.chlamydomonos.clmcore.ChlamydomonosiaCore");
            MODID = (String) chlamydomonosiaCore.getField("MODID").get(null);
        }
        catch (Exception e)
        {
            throw new RuntimeException("ChlamydomonosiaCore not found");
        }
    }
}
