package map_interface.key_with_highest_value;

import java.net.Inet4Address;
import java.util.Map;

public class HighestValueUtility {

    public static StringBuilder highestValue(Map<String,Integer> map){

        int maxi=0;
        StringBuilder sb=new StringBuilder();// using string builder as this will not create new objects
        for(Map.Entry<String,Integer>it:map.entrySet()){

            if(it.getValue()>maxi){
                maxi=it.getValue();

                sb.delete(0,sb.length());
                sb.append(it.getKey());
            }

        }

        return sb;
    }

}
