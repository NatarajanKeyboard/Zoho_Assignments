package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BasicOperations {
    public static void main(String[] args) {//learnt .entrySet()
        Map<String,Integer> names=new HashMap<>();
        
        names.put( "Alice", 30);
        names.put("Bob", 25);
        names.put("Charlie", 35);
        names.put("Diana", 28);
        names.put("Edward", 40);
        System.out.println(names.get("Charlie"));        

        for (Entry e: names.entrySet()) {
            System.out.println(e);
        }
    }
}
