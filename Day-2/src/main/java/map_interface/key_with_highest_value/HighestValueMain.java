package map_interface.key_with_highest_value;

import java.util.HashMap;
import java.util.Map;

public class HighestValueMain {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
// using string builder as this help to reduce space complexity and reduce heap usages
        StringBuilder sb=HighestValueUtility.highestValue(map);
        System.out.println("The Key that contains highest value: "+sb);
    }
}
