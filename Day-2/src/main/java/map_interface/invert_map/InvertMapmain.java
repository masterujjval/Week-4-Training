package map_interface.invert_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InvertMapmain {
    public static void main(String[] args) {
        Map<Character,Integer>map=new HashMap<>();
        map.put('A',1);
        map.put('B',2);
        map.put('C',1);

        Map<Integer,ArrayList<Character>>ans= InvertMapUtility.invertMap(map);

        for(Map.Entry<Integer,ArrayList<Character>>it:ans.entrySet()){
            System.out.println(it.getKey()+" -> "+ it.getValue());
        }


    }
}
