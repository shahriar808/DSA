package array_problem;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_L1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int []{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int []{};
    }
    public static void main(String[] args) {
        TwoSum_L1 twoSum = new TwoSum_L1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
