package search_problem;

public class BinarySearch_L704 {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch_L704 obj = new BinarySearch_L704();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(obj.search(nums, target));
    }
}
