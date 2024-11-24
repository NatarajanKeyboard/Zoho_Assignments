package Maps;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {// learnt .getKey() and .getValue()
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        
        Map<String,Integer> map2=new HashMap<>();
        map2.put("b", 3);
        map2.put("c", 4);

        for (Map.Entry<String,Integer> e: map2.entrySet()) {
            map1.put(e.getKey(),e.getValue());
        }

        System.out.println(map1);
    }
}
