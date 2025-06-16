package array_problem;

public class MaximumDifferenceBetweenIncreasingElements_L2016 {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int ans = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > min) {
                ans = Math.max(ans, nums[i] - min);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        MaximumDifferenceBetweenIncreasingElements_L2016 solution = new MaximumDifferenceBetweenIncreasingElements_L2016();
        int[] nums = {1, 5, 2, 10};
        int result = solution.maximumDifference(nums);
        System.out.println("Maximum difference between increasing elements: " + result); // Output: 9
    }
}
