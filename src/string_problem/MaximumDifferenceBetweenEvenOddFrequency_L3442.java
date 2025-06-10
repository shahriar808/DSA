package string_problem;

public class MaximumDifferenceBetweenEvenOddFrequency_L3442 {
    public int maxDifference(String s) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }
        int maxEven = s.length();
        int maxOdd = 0;
        for (int i = 0; i < 26; i++) {
            if (map[i] > 0) {
                if (map[i] % 2 == 0) {
                    maxEven = Math.min(maxEven, map[i]);
                } else {
                    maxOdd = Math.max(maxOdd, map[i]);
                }
            }
        }
        return maxOdd - maxEven;
    }
    public static void main(String[] args) {
        MaximumDifferenceBetweenEvenOddFrequency_L3442 solution = new MaximumDifferenceBetweenEvenOddFrequency_L3442();
        String s = "aabbccddeeffgghh";
        int result = solution.maxDifference(s);
        System.out.println("Maximum difference between odd and even frequency: " + result);
    }
}
