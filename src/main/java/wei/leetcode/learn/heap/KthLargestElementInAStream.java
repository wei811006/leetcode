package wei.leetcode.learn.heap;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 703 Kth Largest Element in a Stream.
 *
 * Design a class to find the kth largest element in a stream.
 * Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 *
 * Your KthLargest class will have a constructor
 * which accepts an integer k and an integer array nums,
 * which contains initial elements from the stream.
 * For each call to the method KthLargest.add,
 * return the element representing the kth largest element in the stream.
 * <p>
 * 2020/3/4
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class KthLargestElementInAStream {

}

class KthLargest {

    List<Integer> list;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        initQueue(nums);
    }

    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size()-k);
    }

    private void initQueue(int[] nums) {
        list = new ArrayList<>();
        for(int num: nums) {
            list.add(num);
        }
    }
}
