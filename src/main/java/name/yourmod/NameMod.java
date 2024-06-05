package name.yourmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import name.yourmod.common.CommonProxy;

@Mod(
        modid = "mod", // Name mod
        name = "mod", // Name mod
        dependencies = "",///If you are making an addon to some mod, then enter here the name mod that should be installed by players
        version = "1.0.0" ///The version of your mod
)


public class NameMod {
    @SidedProxy(clientSide = "name.yourmod.client.ClientProxy", ///Specify path to ClientProxy file (replace the name.yourmod at name of your mod)
            serverSide = "name.yourmod.common.CommonProxy") ///Specify path to CommonProxy file (replace the name.yourmod at name of your mod)
    public static CommonProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }

    @Mod.Instance("quantumupgrade")
    public static NameMod instance;
}
