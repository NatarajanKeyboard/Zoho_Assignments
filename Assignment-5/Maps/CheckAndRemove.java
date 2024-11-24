package Maps;

import java.util.HashMap;
import java.util.Map;

public class CheckAndRemove {// learnt .containsKey() and .remove()
    public static void main(String[] args) {
        Map<String,Integer> details=new HashMap<>();
        details.put("John", 85);
        details.put("Jane", 92);
        details.put("Tom", 76);
        details.put("Lucy", 89);

        System.out.println("Before: "+details);
        if(details.containsKey("Tom"))
        {
            details.remove("Tom");
        }

        System.out.println("After: "+details);
    }
}
