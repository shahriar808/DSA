package search_problem;

public class RotatedSortedArray_L81 {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if(nums[left] == nums[mid] && nums[right] == nums[mid]){
                left++;
                right--;
            }
            else if(nums[left] <= nums[mid]) {
                if (nums[mid] >= target && nums[left] <= target)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {
                if (nums[mid] <= target && nums[right] >= target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        RotatedSortedArray_L81 solution = new RotatedSortedArray_L81();
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean result = solution.search(nums, target);
        System.out.println("Is " + target + " present: " + result);
    }
}
