package wei.leetcode.learn.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KthLargestTest {


    @Test
    void testKthLargest() {
        int k = 3;
        int[] arr = {4,5,8,2};
        KthLargest kthLargest = new KthLargest(k, arr);

        assertThat(kthLargest.add(3)).isEqualTo(4);
        assertThat(kthLargest.add(5)).isEqualTo(5);
        assertThat(kthLargest.add(10)).isEqualTo(5);
        assertThat(kthLargest.add(9)).isEqualTo(8);
        assertThat(kthLargest.add(4)).isEqualTo(8);
    }

    @Test
    void testKthLargest2() {
        int k = 1;
        int[] arr = {};
        KthLargest kthLargest = new KthLargest(k, arr);

        assertThat(kthLargest.add(-3)).isEqualTo(4);

    }
}