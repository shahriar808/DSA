package recursion_problem;

public class PowerOfTwo_L231 {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n == 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }
    public static void main(String[] args) {
        PowerOfTwo_L231 solution = new PowerOfTwo_L231();
        System.out.println(solution.isPowerOfTwo(16)); // true
        System.out.println(solution.isPowerOfTwo(0));  // false
        System.out.println(solution.isPowerOfTwo(18)); // false
        System.out.println(solution.isPowerOfTwo(32)); // true
    }
}
