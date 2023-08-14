package cdl.mxmod.enchant;

import cdl.mxmod.MxMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class AllEnchanments {
    public static Map<String, Enchantment> enchantmentList= new HashMap<>() {{
        put("more_heart", new MoreHeartEnchant());

    }};

    public static void RegistryAllEnchanments(){
        for(Map.Entry<String, Enchantment> enchantment : enchantmentList.entrySet()){
            Registry.register(Registries.ENCHANTMENT, new Identifier(MxMod.modid, enchantment.getKey()), enchantment.getValue());
        }
    }
}
