package array_problem;

public class EvenNumberOfDigits_L1295 {
    //using string
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //using math
    public int findNumbers2(int[] nums) {
        int evenNum = 0;
        for(int num : nums){
            int count = 0;
            while(num != 0){
                count++;
                num = num / 10;
            }
            if(count % 2 == 0){
                evenNum++;
            }
        }
        return evenNum;
    }
    public static void main(String[] args) {
        EvenNumberOfDigits_L1295 obj = new EvenNumberOfDigits_L1295();
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(obj.findNumbers(nums)); // Output: 2
        System.out.println(obj.findNumbers2(nums)); // Output: 2
    }
}
