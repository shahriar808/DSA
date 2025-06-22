package string_problem;

public class DivideStringIntoGroupsOfSizek_L2138 {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() % k != 0) {
            sb.append(fill);
        }
        String res[] = new String[sb.length() / k];
        for (int i = 0; i < sb.length() / k; i++) {
            res[i] = sb.substring(i * k, (i + 1) * k);
        }
        return res;
    }
    public static void main(String[] args) {
        DivideStringIntoGroupsOfSizek_L2138 solution = new DivideStringIntoGroupsOfSizek_L2138();
        String s = "abcdefghi";
        int k = 3;
        char fill = 'x';
        String[] result = solution.divideString(s, k, fill);
        for (String str : result) {
            System.out.println(str); // Output: "abc", "def", "ghi"
        }
    }
}
