package queue;

public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    // Enqueue - Add element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        queue[rear] = value;
        rear = (rear + 1) % capacity;  // Wrap around if necessary
        size++;
    }

    // Dequeue - Remove element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;  // Indicating empty queue
        }
        int removedValue = queue[front];
        front = (front + 1) % capacity;  // Wrap around if necessary
        size--;
        return removedValue;
    }

    // Peek - Get the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;  // Indicating empty queue
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get the current size of the queue
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        System.out.println("Peek: " + cq.peek());  // 10
        System.out.println("Dequeue: " + cq.dequeue());  // 10
        System.out.println("Dequeue: " + cq.dequeue());  // 20
        cq.enqueue(60);
        System.out.println("Peek after enqueue: " + cq.peek());  // 30
        System.out.println("Is Full: " + cq.isFull());  // false
    }
}

