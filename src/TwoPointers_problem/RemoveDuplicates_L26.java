package TwoPointers_problem;

public class RemoveDuplicates_L26 {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        RemoveDuplicates_L26 solution = new RemoveDuplicates_L26();
        int[] nums = {1, 1, 2};
        int result = solution.removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + result);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
