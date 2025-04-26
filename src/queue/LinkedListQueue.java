package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    Queue<Integer> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    // Enqueue - Add an element
    public void enqueue(int value) {
        queue.add(value);  // or queue.offer(value);
    }

    // Dequeue - Remove an element
    public int dequeue() {
        if (!queue.isEmpty()) {
            return queue.poll();  // Removes and returns the front element
        } else {
            throw new IllegalStateException("Queue is empty!");
        }
    }

    // Peek - Get the front element without removing
    public int peek() {
        if (!queue.isEmpty()) {
            return queue.peek();  // Returns but doesn't remove the front element
        } else {
            throw new IllegalStateException("Queue is empty!");
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        LinkedListQueue llQueue = new LinkedListQueue();
        llQueue.enqueue(10);
        llQueue.enqueue(20);
        System.out.println("Peek: " + llQueue.peek());  // 10
        System.out.println("Dequeue: " + llQueue.dequeue());  // 10
        System.out.println("Is Empty: " + llQueue.isEmpty());  // false
    }
}


