package Maps;

import java.util.TreeMap;

import java.util.Iterator;
import java.util.Map;
public class IterateThroughMap {
   public static void main(String[] args) {//learnt map initialization with .of() .ofEntries() and double brace initialization

    // Creating an immutable map at the time of declaration 
    Map<String, Integer> map1 = Map.of( "banana", 2, "apple", 5, "cherry", 7,"date",3 );
    Map<String,Integer> treeMap1=new TreeMap<>(map1);


    // Creating an immutable map using Map.ofEntries 
    Map<String, Integer> map2 = Map.ofEntries( Map.entry("banana", 2), Map.entry("apple", 5), Map.entry("cherry", 7),Map.entry("date",3));
    Map<String,Integer> treeMap2=new TreeMap(map2);

    // there aren't TreeMap.of() or TreeMap.entries() methods in the Java standard library




    // Creating a mutable map at the time of declaration using double brace initialization 
    Map<String, Integer> treeMap = new TreeMap<>() {{ put("banana", 2); put("apple", 5); put("cherry", 7);put("date",3);}};

    Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator(); 
    while (iterator.hasNext()) 
    { 
        System.out.println(iterator.next());
    } 
}
   
}
