package stack_poblem;

import java.util.Stack;

public class MinStack_L155 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack_L155() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        MinStack_L155 minStack = new MinStack_L155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // Returns -3.
        minStack.pop();
        System.out.println(minStack.top());    // Returns 0.
        System.out.println(minStack.getMin()); // Returns -2.
    }
}
