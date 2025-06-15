package math_problem;

public class ReverseInteger_L7 {
    public int reverse(int x) {
        long rev = 0L;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
    }
    public static void main(String[] args) {
        ReverseInteger_L7 solution = new ReverseInteger_L7();
        int num = -123;
        int result = solution.reverse(num);
        System.out.println("Reversed number: " + result); // Output: -321
    }
}
