package map_interface.word_frequency_counter;

import java.net.Inet4Address;
import java.util.*;

public class MapUtility {

    public static Map<String,Integer> wordCounter(String s){

        Map<String,Integer>map=new HashMap<>();
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9\\s]","");
        List<String> ans = new ArrayList<>(Arrays.asList(s.split("\\s+")));
        for(int i=0;i< ans.size();i++){
            int count=map.getOrDefault(ans.get(i),0);
            map.put(ans.get(i),count+1);
        }

    // traversing the map
        for(Map.Entry<String, Integer>it:map.entrySet()){
            System.out.println(it.getKey()+" -> "+it.getValue());
        }
        return map;

    }


}
