package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeQueue {
    Deque<Integer> deque;

    public ArrayDequeQueue() {
        deque = new ArrayDeque<>();
    }

    // Enqueue - Add an element at the end
    public void enqueue(int value) {
        deque.addLast(value);
    }

    // Dequeue - Remove an element from the front
    public int dequeue() {
        if (!deque.isEmpty()) {
            return deque.pollFirst();  // Removes and returns the first element
        } else {
            throw new IllegalStateException("Queue is empty!");
        }
    }

    // Peek - Get the front element without removing
    public int peek() {
        if (!deque.isEmpty()) {
            return deque.peekFirst();  // Returns but doesn't remove the first element
        } else {
            throw new IllegalStateException("Queue is empty!");
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        ArrayDequeQueue adQueue = new ArrayDequeQueue();
        adQueue.enqueue(10);
        adQueue.enqueue(20);
        System.out.println("Peek: " + adQueue.peek());  // 10
        System.out.println("Dequeue: " + adQueue.dequeue());  // 10
        System.out.println("Is Empty: " + adQueue.isEmpty());  // false
    }
}

