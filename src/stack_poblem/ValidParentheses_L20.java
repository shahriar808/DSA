package stack_poblem;

import java.util.Stack;

public class ValidParentheses_L20 {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //different approach
    public boolean isValid2(String s) {
        if(s.length() % 2 != 0) return false;
       Stack<Character> stack = new Stack<>();
       for (char c : s.toCharArray()) {
           if(c == '('){
                stack.push(')');
           } else if (c == '{') {
                stack.push('}');
           } else if (c == '[') {
                stack.push(']');
           } else {
               if(stack.isEmpty() || stack.pop() != c){
                   return false;
               }
           }
       }
         return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses_L20 obj = new ValidParentheses_L20();
        System.out.println(obj.isValid("()[]{}")); // true
        System.out.println(obj.isValid("(]")); // false
        System.out.println(obj.isValid2("([)]")); // false
        System.out.println(obj.isValid2("{[]}")); // true
    }
}
