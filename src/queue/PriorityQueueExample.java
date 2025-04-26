package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    Queue<Integer> pq;

    public PriorityQueueExample() {
        pq = new PriorityQueue<>();
    }

    // Enqueue - Add an element
    public void enqueue(int value) {
        pq.add(value);  // Adds the element to the priority queue
    }

    // Dequeue - Remove the element with the highest priority (smallest number by default)
    public int dequeue() {
        if (!pq.isEmpty()) {
            return pq.poll();  // Removes and returns the smallest element
        } else {
            throw new IllegalStateException("Queue is empty!");
        }
    }

    // Peek - Get the element with the highest priority without removing
    public int peek() {
        if (!pq.isEmpty()) {
            return pq.peek();  // Returns but doesn't remove the smallest element
        } else {
            throw new IllegalStateException("Queue is empty!");
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return pq.isEmpty();
    }

    public static void main(String[] args) {
        PriorityQueueExample pqQueue = new PriorityQueueExample();
        pqQueue.enqueue(30);
        pqQueue.enqueue(10);
        pqQueue.enqueue(20);
        System.out.println("Peek: " + pqQueue.peek());  // 10 (smallest)
        System.out.println("Dequeue: " + pqQueue.dequeue());  // 10
        System.out.println("Is Empty: " + pqQueue.isEmpty());  // false
    }
}

