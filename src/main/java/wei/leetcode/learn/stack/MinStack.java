package wei.leetcode.learn.stack;

import java.util.Stack;

/**
 * 155 Min Stack.
 *
 * Design a stack that supports push, pop, top,
 * and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * <p>
 * 2020/2/28
 *
 * @author wei
 * @version 1.0.0
 **/
public class MinStack {

    Stack<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min = stack.peek();
        for ( int i: stack ) {
            if ( i < min ) {
                min = i;
            }
        }
        return min;
    }
}
