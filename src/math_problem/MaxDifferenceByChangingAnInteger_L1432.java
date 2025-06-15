package math_problem;

public class MaxDifferenceByChangingAnInteger_L1432 {
    public int maxDiff(int num) {
        String str = String.valueOf(num);
        int n = str.length();
        char[] maxChars = str.toCharArray();
        char[] minChars = str.toCharArray();
        char maxDigit = ' ';
        for (int i = 0; i < n; i++) {
            if (maxChars[i] != '9') {
                maxDigit = maxChars[i];
                break;
            }
        }
        for (int i = 0; i < maxChars.length; i++) {
            if (maxChars[i] == maxDigit) {
                maxChars[i] = '9';
            }
        }
        char minDigit = minChars[0];
        char replace = '1';
        if (minDigit == '1') {
            for (int i = 1; i < n; i++) {
                if (minChars[i] != '1' && minChars[i] != '0') {
                    minDigit = minChars[i];
                    replace = '0';
                    break;
                }
            }
        }
        for (int i = 0; i < minChars.length; i++) {
            if (minChars[i] == minDigit) {
                minChars[i] = replace;
            }
        }
        int max = Integer.parseInt(new String(maxChars));
        int min = Integer.parseInt(new String(minChars));
        return max - min;
    }
    public static void main(String[] args) {
        MaxDifferenceByChangingAnInteger_L1432 solution = new MaxDifferenceByChangingAnInteger_L1432();
        int num = 555;
        int result = solution.maxDiff(num);
        System.out.println("Maximum difference by changing an integer: " + result); // Output: 888
    }
}
