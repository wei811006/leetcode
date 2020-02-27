package wei.leetcode.learn.stack;

import java.util.Stack;

/**
 * 232 Implement Queue using Stacks.
 * <p>
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * <p>
 * 2020/2/27
 *
 * @author wei
 * @version 1.0.0
 **/
public class ImplementQueueUsingStacks {

}

class MyQueue {

    Stack<Integer> stack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int num = stack.get(0);
        stack.remove(0);
        return num;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack.get(0);
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty();
    }
}