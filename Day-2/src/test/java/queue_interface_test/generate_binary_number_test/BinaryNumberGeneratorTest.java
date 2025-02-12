package queue_interface_test.generate_binary_number_test;

import org.junit.Assert;
import org.junit.Test;
import queue_interface.generate_binary_number.BinaryNumberGenerator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGeneratorTest {
    @Test
    public void tester(){
        int N = 5;
        Queue<String> ans=new LinkedList<>();
        ans= BinaryNumberGenerator.generateBinaryNumbers(N);
        Queue<String>test=new LinkedList<>(Arrays.asList("1","10","11","100","101"));
        Assert.assertEquals(test,ans);
    }
}
