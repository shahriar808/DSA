package hashing_problem;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome_L2131 {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int length = 0;
        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            if (map.getOrDefault(rev, 0) > 0) {
                map.put(rev, map.get(rev) - 1);
                length += 4;
            } else {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        for (String word : map.keySet()) {
            if (word.charAt(0) == word.charAt(1) && map.get(word) > 0) {
                length += 2;
                break;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        LongestPalindrome_L2131 solution = new LongestPalindrome_L2131();
        String[] words = {"ab", "ba", "cc", "dd", "ee"};
        System.out.println(solution.longestPalindrome(words));
    }
}
