package array_problem;

import java.util.Arrays;

public class PartitionArraySuchThatMaximumDifferenceIsK_L2294 {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - min > k) {
                ans++;
                min = nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        PartitionArraySuchThatMaximumDifferenceIsK_L2294 solution = new PartitionArraySuchThatMaximumDifferenceIsK_L2294();
        int[] nums = {1, 3, 6, 7, 9};
        int k = 2;
        int result = solution.partitionArray(nums, k);
        System.out.println("Minimum number of partitions: " + result); // Output: 3
    }
}
