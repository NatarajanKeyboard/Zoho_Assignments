package Maps;
import java.util.HashMap;
import java.util.Map;
public class CountFreqOfElem {
    public static void main(String[] args) {
        Map<Character,Integer> frequencyMap=new HashMap<>();
        String input="Programming";

        for (char c : input.toCharArray()) {
            if(frequencyMap.containsKey(c))
            {
                frequencyMap.put(c, frequencyMap.get(c)+1);
            }
            else{
                frequencyMap.put(c, 1);
            }
        }
        System.out.println(input+"\n"+frequencyMap);
    }
}
