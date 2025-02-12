package map_interface_test.invert_map_test;

import map_interface.invert_map.InvertMapUtility;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InvertMapTest {
    @Test
    public void tester(){
        Map<Character,Integer> map=new HashMap<>();
        map.put('A',1);
        map.put('B',2);
        map.put('C',1);



        Map<Integer, ArrayList<Character>>ans= InvertMapUtility.invertMap(map);
        Map<Integer, ArrayList<Character>>tester= InvertMapUtility.invertMap(map);
        Assert.assertEquals(tester,ans);


    }
}
