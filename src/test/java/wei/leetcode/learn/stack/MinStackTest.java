package wei.leetcode.learn.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    void testMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertThat(minStack.getMin()).isEqualTo(-3);
        minStack.pop();
        assertThat(minStack.top()).isEqualTo(0);
        assertThat(minStack.getMin()).isEqualTo(-2);
    }

}