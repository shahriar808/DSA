package prefixSum_problem;

public class FindPivotIndex_L724 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int prefix_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (prefix_sum == sum) {
                return i;
            }
            prefix_sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex_L724 obj = new FindPivotIndex_L724();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = obj.pivotIndex(nums);
        System.out.println("The pivot index is: " + result);
    }
}
