package wei.leetcode.learn.heap;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 215 Kth Largest Element in an Array.
 *
 * Find the kth largest element in an unsorted array.
 * Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 * <p>
 * 2020/3/5
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums) {
            queue.add(num);
        }

        while(k>0) {
            if ( k == 1 ) {
                return queue.poll();
            }
            queue.poll();
            k--;
        }

        return 0;
    }
}
