package stack;

class MyStack {
    int[] arr;
    int top;
    int capacity;

    public MyStack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
    boolean isFull() {
        return top == capacity - 1;
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}

