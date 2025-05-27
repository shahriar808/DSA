package recursion_problem;

public class PowerOfThree_L326 {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n == 0 || n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
    }
    public static void main(String[] args) {
        PowerOfThree_L326 solution = new PowerOfThree_L326();
        System.out.println(solution.isPowerOfThree(27)); // true
        System.out.println(solution.isPowerOfThree(0));  // false
        System.out.println(solution.isPowerOfThree(9));  // true
        System.out.println(solution.isPowerOfThree(45)); // false
    }
}
