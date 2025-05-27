package recursion_problem;

public class FibonacciNumber_L509 {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    // better solution (without recursion)
    public int fib2(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        FibonacciNumber_L509 solution = new FibonacciNumber_L509();
        System.out.println(solution.fib(10));
        System.out.println(solution.fib2(10));
    }
}
