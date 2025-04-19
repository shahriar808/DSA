package array_problem;

public class SortColors_L75 {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SortColors_L75 sorter = new SortColors_L75();
        int[] colors = {2, 0, 2, 1, 1, 0, 2};
        sorter.sortColors(colors);
        for (int color : colors) {
            System.out.print(color + " ");
        }
    }
}
