package queue_problem;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight_L1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            int top1 = pq.remove();
            int top2 = pq.remove();
            if (top1 != top2) {
                pq.add(top1 - top2);
            }
        }
        return pq.isEmpty() ? 0 : pq.remove();
    }
    public static void main(String[] args) {
        LastStoneWeight_L1046 solution = new LastStoneWeight_L1046();
        int[] stones = {2, 7, 4, 1, 8, 1};
        int result = solution.lastStoneWeight(stones);
        System.out.println("The weight of the last stone: " + result);
    }
}
