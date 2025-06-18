package array_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArrayIntoArraysWithMaxDifference_L2966 {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 3) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if (c - a > k) {
                return new int[0][];
            }
            result.add(new int[]{a, b, c});
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        DivideArrayIntoArraysWithMaxDifference_L2966 solution = new DivideArrayIntoArraysWithMaxDifference_L2966();
        int[] nums = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        int k = 2;
        int[][] result = solution.divideArray(nums, k);
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr)); // Output: [1,1,3], [3,4,5], [7,8,9]
        }
    }
}
