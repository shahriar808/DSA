package prefixSum_problem;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK_L560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK_L560 subarraySumEqualsK = new SubarraySumEqualsK_L560();
        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        int result = subarraySumEqualsK.subarraySum(nums, k);
        System.out.println("The number of subarrays whose sum equals to " + k + " is: " + result);
    }
}
