package list_interface.remove_duplicates;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicatesMain {

    public static void main(String[] args) {
        // [2,3,3,2,1,4,4,1]
        //[2,3,1,4]
        List<Integer>list=new ArrayList<>(Arrays.asList(1,1,1,3,2,3,4,1,4));
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i< list.size();i++){
            if(list.get(i)!=-1){
                ans.add(list.get(i));
            }
            for(int j=i+1;j<list.size();j++){
                if(Objects.equals(list.get(j), list.get(i)))list.set(j,-1);
            }

        }

        System.out.println("List after removing duplicates: "+ans);

    }

}
