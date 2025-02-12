package queue_interface_test.reverse_a_queue_test;

import org.junit.Assert;
import org.junit.Test;
import queue_interface.reverse_a_queue.QueueUtility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUtilityTest {
    @Test
    public void tester(){
        Queue<Integer> queue=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Queue<Integer>ans=new LinkedList<>();
        ans= QueueUtility.queueUtility(queue);
        Queue<Integer>test=new LinkedList<>(Arrays.asList(5,4,3,2,1));

        Assert.assertEquals(test,ans);
    }
}
