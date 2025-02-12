package map_interface_test.word_frequency_counter_test;
import map_interface.word_frequency_counter.MapUtility;
import map_interface.word_frequency_counter.MapUtility.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class MapUtilityTest {
    @Test
    public void tester(){
    String s="!!Nevermind, win win situation!";
        Map<String,Integer> map=new HashMap<>();

  map= MapUtility.wordCounter(s);
        Map<String,Integer> test=new HashMap<>();
        test.put("nevermind",1);
        test.put("win",2);
        test.put("situation",1);

        Assert.assertEquals(map,test);


    }
}
