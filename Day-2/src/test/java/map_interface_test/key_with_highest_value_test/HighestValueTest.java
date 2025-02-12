package map_interface_test.key_with_highest_value_test;

import map_interface.key_with_highest_value.HighestValueUtility;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HighestValueTest {
    @Test
    public void tester(){

        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
// using string builder as this help to reduce space complexity and reduce heap usages
        StringBuilder sb= HighestValueUtility.highestValue(map);

        Assert.assertEquals("C",sb.toString());

    }
}
