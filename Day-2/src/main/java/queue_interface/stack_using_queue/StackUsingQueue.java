package queue_interface.stack_using_queue;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    public void push(int x) {
        q2.add(x); // Add new element to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove()); // Move all elements from q1 to q2
        }
        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return q1.remove(); // Remove the front element (top of stack)
    }

    // Top operation
    public int top() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return q1.peek(); // Peek the front element (top of stack)
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.top());
    }
}
