package wei.leetcode.learn.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementStackUsingQueuesTest {

    @Test
    void testMyStack() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        assertThat(stack.top()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.empty()).isFalse();
    }

}