package search_problem;

public class FirstAndLastPosition_L34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int leftIndex = binarySearch(nums, target, true);
        int rightIndex = binarySearch(nums, target, false);
        if (leftIndex != -1 && rightIndex != -1) {
            result[0] = leftIndex;
            result[1] = rightIndex;
        }
        return result;

    }
    private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (isSearchingLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FirstAndLastPosition_L34 solution = new FirstAndLastPosition_L34();
        int[] nums = {5, 6, 7, 8, 9};
        int target = 7;
        int[] result = solution.searchRange(nums, target);
        System.out.println("First and last position of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
