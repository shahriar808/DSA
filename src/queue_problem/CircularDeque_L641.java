package queue_problem;

public class CircularDeque_L641 {
    int[] deque;
    int front, rear, size, capacity;
    public CircularDeque_L641(int k) {
        capacity = k;
        deque = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        deque[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return deque[(rear - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
    public static void main(String[] args) {
        CircularDeque_L641 circularDeque = new CircularDeque_L641(3);
        System.out.println(circularDeque.insertLast(1)); // return true
        System.out.println(circularDeque.insertLast(2)); // return true
        System.out.println(circularDeque.insertFront(3)); // return true
        System.out.println(circularDeque.insertFront(4)); // return false, the deque is full
        System.out.println(circularDeque.getRear());      // return 2
        System.out.println(circularDeque.isFull());       // return true
        System.out.println(circularDeque.deleteLast());   // return true
        System.out.println(circularDeque.insertFront(4));  // return true
        System.out.println(circularDeque.getFront());     // return 4
    }
}
