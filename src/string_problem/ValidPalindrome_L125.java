package string_problem;

public class ValidPalindrome_L125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome_L125 validPalindrome = new ValidPalindrome_L125();
        String s = "A man, a plan, a canal: Panama";
        boolean result = validPalindrome.isPalindrome(s);
        System.out.println(result);
    }
}
