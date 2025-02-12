package queue_interface.reverse_a_queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueUtility {

    public static Queue<Integer> queueUtility(Queue<Integer>queue){

       if(queue.isEmpty())
           return queue;
       // we already have another queue to perform operation
        int front=queue.remove();
        queue=queueUtility(queue);
        queue.offer(front);


    return queue;
    }


}
