package search_problem;

public class RotatedSortedArray_L33 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // Check if the left half is sorted
            else if(nums[left] <= nums[mid]) {
                if (nums[mid] >= target && nums[left] <= target)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            // If the left half is not sorted, then the right half must be sorted
            else {
                if (nums[mid] <= target && nums[right] >= target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        RotatedSortedArray_L33 solution = new RotatedSortedArray_L33();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = solution.search(nums, target);
        System.out.println("Index of " + target + ": " + result);
    }
}
