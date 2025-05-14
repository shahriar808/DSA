package hashing_problem;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_L290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(words[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(c, words[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern_L290 obj = new WordPattern_L290();
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = obj.wordPattern(pattern, s);
        System.out.println(result);
    }

}
