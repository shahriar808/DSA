package bitManipulation_problem;

public class AddBinary_L67 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        
        return result.reverse().toString();
    }
    
    public static void main(String[] args) {
        AddBinary_L67 addBinary = new AddBinary_L67();
        String a = "1010";
        String b = "1011";
        String result = addBinary.addBinary(a, b);
        System.out.println(result);
    }
}