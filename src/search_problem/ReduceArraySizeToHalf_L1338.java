package search_problem;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReduceArraySizeToHalf_L1338 {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        pq.addAll(map.values());
        int length = arr.length / 2;
        int count = 0;
        int answer = 0;
        for (int i = 0; i < pq.size(); i++) {
            int top = pq.remove();
            answer++;
            count += top;
            if (count >= length) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ReduceArraySizeToHalf_L1338 solution = new ReduceArraySizeToHalf_L1338();
        int[] arr = {3,3,3,3,5,5,5,2,2,7};
        int result = solution.minSetSize(arr);
        System.out.println("Minimum number of unique integers to remove: " + result);
    }

}
