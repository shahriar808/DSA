package search_problem;

import java.util.HashSet;

public class DoubleExist_L1346 {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if((set.contains(num * 2)) || (num % 2 == 0 && set.contains(num / 2))){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        DoubleExist_L1346 obj = new DoubleExist_L1346();
        int[] arr = {10, 2, 5, 3};
        System.out.println(obj.checkIfExist(arr));
    }
}
