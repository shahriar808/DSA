package search_problem;

public class SplitArrayLargestSum_L410 {
    public int splitArray(int[] nums, int k) {
        int left = nums[0];
        int right = 0;
        for (int i : nums) {
            left = Math.max(left, i);
            right += i;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (splitCount(nums, mid) > k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int splitCount(int[] nums, int mid) {
        int count = 1;
        int cur = 0;
        for (int num : nums) {
            if (cur + num <= mid) {
                cur += num;
            } else {
                count++;
                cur = num;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        SplitArrayLargestSum_L410 obj = new SplitArrayLargestSum_L410();
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        int result = obj.splitArray(nums, k);
        System.out.println("The largest sum of the split array is: " + result);
    }
}
