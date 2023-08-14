package cdl.mxmod.item;

import cdl.mxmod.MxMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class AllItems {
    public static Map<String, Item> itemList= new HashMap<>() {{
        put("a", new Item(new Item.Settings()));

    }};

    public static void RegistryAllItems(){
        for(Map.Entry<String, Item> item : itemList.entrySet()){
            Registry.register(Registries.ITEM, new Identifier(MxMod.modid, item.getKey()), item.getValue());
        }
    }
}
