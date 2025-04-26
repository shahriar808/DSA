package queue_problem;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls_L933 {
    Queue<Integer> queue;
    public NumberOfRecentCalls_L933() {
        queue = new LinkedList<>();
    }
    public int ping(int t){
        queue.add(t);
        while(!queue.isEmpty() && queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
    public static void main(String[] args) {
        NumberOfRecentCalls_L933 obj = new NumberOfRecentCalls_L933();
        System.out.println(obj.ping(1)); // Output: 1
        System.out.println(obj.ping(100)); // Output: 2
        System.out.println(obj.ping(3001)); // Output: 3
        System.out.println(obj.ping(3002)); // Output: 3
    }
}
