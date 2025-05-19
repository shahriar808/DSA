package queue_problem;

import java.util.PriorityQueue;

public class KthLargestElement_L215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        KthLargestElement_L215 obj = new KthLargestElement_L215();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = obj.findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}
