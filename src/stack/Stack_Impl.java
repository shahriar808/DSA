package stack;

import java.util.Stack;

public class Stack_Impl {
    public static void main(String[] args) {
        Stack<Integer> stackImpl = new Stack<>();
        stackImpl.push(5);
        stackImpl.push(15);
        stackImpl.push(25);
        System.out.println(stackImpl);
        System.out.println("Top element is: " + stackImpl.peek());
        System.out.println("Popped element is: " + stackImpl.pop());
        System.out.println("Is stack empty? " + stackImpl.isEmpty());
    }
}
