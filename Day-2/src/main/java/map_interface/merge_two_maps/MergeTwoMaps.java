package map_interface.merge_two_maps;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {

    public static Map<Character,Integer> merger(Map<Character,Integer>map1,Map<Character,Integer>map2){

        // creating a final ans map
        Map<Character,Integer>ans=new HashMap<>();

        // Traversing through first map1
        for(Map.Entry<Character,Integer>it:map1.entrySet()){
            int sum=ans.getOrDefault(it.getKey(),0);
            sum+=it.getValue();
            ans.put(it.getKey(),sum);
        }

        for(Map.Entry<Character,Integer>it:map2.entrySet()){
            int sum=ans.getOrDefault(it.getKey(),0);
            sum+=it.getValue();
            ans.put(it.getKey(),sum);
        }


        return ans;
    }


}
