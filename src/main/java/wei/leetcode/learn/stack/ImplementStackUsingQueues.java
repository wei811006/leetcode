package wei.leetcode.learn.stack;

import java.util.*;

/**
 * 225 Implement Stack using Queues.
 * <p>
 * mplement the following operations of a stack using queues.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * <p>
 * 2020/2/28
 *
 * @author wei
 * @version 1.0.0
 **/
public class ImplementStackUsingQueues {

}

class MyStack {

    Deque<Integer> queue;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue = new ArrayDeque<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.offerLast(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.pollLast();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peekLast();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}
