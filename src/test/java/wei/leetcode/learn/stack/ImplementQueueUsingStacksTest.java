package wei.leetcode.learn.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementQueueUsingStacksTest {

    @Test
    public void test() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        assertThat(myQueue.peek()).isEqualTo(1);
        assertThat(myQueue.pop()).isEqualTo(1);
        assertThat(myQueue.empty()).isFalse();
    }
}