package net.catalog.structural.flyweightOne;

import java.util.HashMap;
import java.util.Map;

public class FlyweightMercedes {
    private Map<String, Mercedes> mercedesMap = new HashMap<>();

    public Mercedes getMercedes(String color){
        Mercedes mercedes = mercedesMap.get(color);
        if(mercedes == null){
            mercedes = new Mercedes();
            mercedes.color = color;
            mercedesMap.put(color, mercedes);
        }
        return mercedes;
    }

}
