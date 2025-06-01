package slidingWindow_problem;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement_L424 {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int maxLength = 0;
        for (char target : map.keySet()) {
            int left = 0, right = 0, count = 0;
            while (right < s.length()) {
                if (s.charAt(right) != target) {
                    count++;
                }
                while (count > k) {
                    if (s.charAt(left) != target) {
                        count--;
                    }
                    left++;
                }
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement_L424 solution = new LongestRepeatingCharacterReplacement_L424();
        String s = "AABABBA";
        int k = 1;
        int result = solution.characterReplacement(s, k);
        System.out.println(result); // Output: 4
    }
}
