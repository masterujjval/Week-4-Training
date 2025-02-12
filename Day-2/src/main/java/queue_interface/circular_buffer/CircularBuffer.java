package queue_interface.circular_buffer;
class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // Insert element (overwrite oldest if full)
    public void insert(int value) {
        if (size == capacity) {
            front = (front + 1) % capacity; // Move front to overwrite oldest element
        } else {
            size++; // Increase size if not full
        }
        buffer[rear] = value;
        rear = (rear + 1) % capacity;
    }

    // Remove the oldest element
    public int remove() {
        if (size == 0) {
            throw new IllegalStateException("Buffer is empty!");
        }
        int removedValue = buffer[front];
        front = (front + 1) % capacity;
        size--;
        return removedValue;
    }

    // Display buffer elements
    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); // output should be Buffer: 1 2 3

        cb.insert(4); // Overwrites 1 and similar to other elemet
        cb.display();

        cb.remove();
        cb.display();

        cb.insert(5);
        cb.display(); //
    }
}
