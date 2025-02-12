package map_interface.word_frequency_counter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s="Hello world, hello Java!";
        Map<String,Integer> map=new HashMap<>();
        map=MapUtility.wordCounter(s);
    }
}
