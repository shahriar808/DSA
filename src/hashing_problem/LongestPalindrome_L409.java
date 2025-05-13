package hashing_problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestPalindrome_L409 {
    public int longestPalindromeSet(String s) {
        //Using set
        HashSet<Character> hs = new HashSet<>();
        int len = 0;
        for (char ch : s.toCharArray()) {
            if (hs.contains(ch)) {
                hs.remove(ch);
                len += 2;
            } else hs.add(ch);
        }
        if (!hs.isEmpty()) len += 1;
        return len;
    }

    //Using Map
    public int longestPalindromeMap(String s) {
        int n = s.length();
        int length = 0;
        if (n < 2) return n;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int count : map.values()) {
            length += (count / 2) * 2;
        }
        if (length < n) {
            length += 1;
        }
        return length;
    }
    public static void main(String[] args) {
        LongestPalindrome_L409 longestPalindrome = new LongestPalindrome_L409();
        String s = "abccccdd";
        int resultSet = longestPalindrome.longestPalindromeSet(s);
        int resultMap = longestPalindrome.longestPalindromeMap(s);
        System.out.println("The length of the longest palindrome is: " + resultMap);
        System.out.println("The length of the longest palindrome is: " + resultSet);
    }
}
