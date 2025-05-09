package TwoPointers_problem;

public class TwoSumII_L167 {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        while (low<high){
            int sum=numbers[low]+numbers[high];
            if (sum>target){
                high--;
            }
            else  if (sum<target) low++;
            else return new int[]{low+1,high+1};
        }
        return new int[]{-1, -1};

    }
    public static void main(String[] args) {
        TwoSumII_L167 solution = new TwoSumII_L167();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
