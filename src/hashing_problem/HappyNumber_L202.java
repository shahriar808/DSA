package hashing_problem;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_L202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = n;
        while (!set.contains(sum)) {
            if (sum == 1) {
                return true;
            }
            set.add(sum);
            sum = sumOfSquare(sum);
        }
        return false;
    }
    private int sumOfSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        HappyNumber_L202 happyNumber = new HappyNumber_L202();
        int n = 19;
        boolean result = happyNumber.isHappy(n);
        System.out.println("Is " + n + " happy: " + result);
    }
}
