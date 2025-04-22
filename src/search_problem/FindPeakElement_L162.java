package search_problem;

public class FindPeakElement_L162 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        FindPeakElement_L162 solution = new FindPeakElement_L162();
        int[] nums = {1, 2, 3, 1};
        int result = solution.findPeakElement(nums);
        System.out.println("Index of a peak element: " + result);
    }
}

