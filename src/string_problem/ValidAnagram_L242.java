package string_problem;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_L242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    //using HashMap
    public boolean isAnagram2(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        ValidAnagram_L242 validAnagram = new ValidAnagram_L242();
        String s = "anagram";
        String t = "nagaram";
        boolean result = validAnagram.isAnagram(s, t);
        System.out.println(result);

        boolean result2 = validAnagram.isAnagram2(s, t);
        System.out.println(result2);
    }
}
