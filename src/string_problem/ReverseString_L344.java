package string_problem;

public class ReverseString_L344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        ReverseString_L344 reverseString = new ReverseString_L344();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(s);
        System.out.println(s);
    }
}
