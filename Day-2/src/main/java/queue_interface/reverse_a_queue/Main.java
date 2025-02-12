package queue_interface.reverse_a_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Queue<Integer>ans=new LinkedList<>();
       ans= QueueUtility.queueUtility(queue);
        System.out.println(ans);
    }
}
