package map_interface.invert_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMapUtility {

    public static Map<Integer, ArrayList<Character>> invertMap(Map<Character,Integer>map){

        Map<Integer,ArrayList<Character>>ans=new HashMap<>();

        for(Map.Entry<Character,Integer>it:map.entrySet()){
            ArrayList<Character> temp = ans.getOrDefault(it.getValue(), new ArrayList<>());
            temp.add(it.getKey());
            ans.put(it.getValue(),temp);
        }
    return ans;
    }

}
