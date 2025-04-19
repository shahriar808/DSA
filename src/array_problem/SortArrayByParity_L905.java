package array_problem;

public class SortArrayByParity_L905 {
    public int[] sortArrayByParity(int[] nums){
        int left = 0, right = nums.length - 1;
        while (left < right){
            if(nums[left] % 2 == 0){
                left++;
            }else if(nums[right] % 2 != 0){
                right--;
            }
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        SortArrayByParity_L905 sorter = new SortArrayByParity_L905();
        int[] nums = {3, 1, 2, 4};
        int[] sorted = sorter.sortArrayByParity(nums);
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
