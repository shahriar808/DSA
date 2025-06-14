package math_problem;

public class MaximumDifferenceRemappingADigit_L2566 {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        char[] maxChars = str.toCharArray();
        char[] minChars = str.toCharArray();
        char replaceForMax = ' ';
        for (char c : maxChars) {
            if (c != '9') {
                replaceForMax = c;
                break;
            }
        }
        for (int i = 0; i < maxChars.length; i++) {
            if (maxChars[i] == replaceForMax) {
                maxChars[i] = '9';
            }
        }
        char replaceForMin = minChars[0];
        for (int i = 0; i < minChars.length; i++) {
            if (minChars[i] == replaceForMin) {
                minChars[i] = '0';
            }
        }
        int maxVal = Integer.parseInt(new String(maxChars));
        int minVal = Integer.parseInt(new String(minChars));
        return maxVal - minVal;
    }

    public static void main(String[] args) {
        MaximumDifferenceRemappingADigit_L2566 solution = new MaximumDifferenceRemappingADigit_L2566();
        int num = 11891;
        int result = solution.minMaxDifference(num);
        System.out.println("Minimum maximum difference after remapping a digit: " + result); // Output: 99009
    }
}
