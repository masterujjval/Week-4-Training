package map_interface.merge_two_maps;

import java.util.HashMap;
import java.util.Map;

public class MargeTwoMapsMain {
    public static void main(String[] args) {
        Map<Character,Integer>map1=new HashMap<>();
        map1.put('A',6);
        map1.put('B',9);
        map1.put('C',3);

        // creating map2
        Map<Character,Integer>map2=new HashMap<>();
        map2.put('A',6);
        map2.put('B',9);
        map2.put('C',3);
        map2.put('Z',12);

        // invoking the method
        Map<Character,Integer>ans=new HashMap<>();
        ans=MergeTwoMaps.merger(map1,map2);

        for(Map.Entry<Character,Integer>it:ans.entrySet()){
            System.out.println(it.getKey()+" -> "+it.getValue());
        }


    }
}
