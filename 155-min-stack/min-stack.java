 import java.util.*;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);   // ✅ FIX
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minstack.peek())) {
                minstack.pop();
            }
            stack.pop();
        }
    }
    
    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }
    
    public int getMin() {
        if (minstack.isEmpty()) return -1;
        return minstack.peek();
    }
}