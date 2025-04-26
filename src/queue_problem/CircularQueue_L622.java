package queue_problem;

public class CircularQueue_L622 {
    int[] queue;
    int front, rear, size, capacity;

    public CircularQueue_L622(int k) {
        capacity = k;
        queue = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        queue[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return queue[(rear - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
    public static void main(String[] args) {
        CircularQueue_L622 circularQueue = new CircularQueue_L622(3);
        System.out.println(circularQueue.enQueue(1)); // return true
        System.out.println(circularQueue.enQueue(2)); // return true
        System.out.println(circularQueue.enQueue(3)); // return true
        System.out.println(circularQueue.enQueue(4)); // return false, the queue is full
        System.out.println(circularQueue.Rear());      // return 3
        System.out.println(circularQueue.isFull());    // return true
        System.out.println(circularQueue.deQueue());   // return true
        System.out.println(circularQueue.enQueue(4));  // return true
        System.out.println(circularQueue.Rear());      // return 4
    }
}
