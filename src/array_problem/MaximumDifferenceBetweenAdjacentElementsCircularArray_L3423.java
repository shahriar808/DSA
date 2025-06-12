package array_problem;

public class MaximumDifferenceBetweenAdjacentElementsCircularArray_L3423 {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maxa = Math.abs(nums[0] - nums[n - 1]);
        for (int i = 0; i < n - 1; i++) {
            maxa = Math.max(maxa, Math.abs(nums[i] - nums[i + 1]));
        }
        return maxa;
    }
    public static void main(String[] args) {
        MaximumDifferenceBetweenAdjacentElementsCircularArray_L3423 solution = new MaximumDifferenceBetweenAdjacentElementsCircularArray_L3423();
        int[] nums = {-5,-10,-5};
        int result = solution.maxAdjacentDistance(nums);
        System.out.println("Maximum difference between adjacent elements in circular array: " + result); // Output: 5
    }
}
