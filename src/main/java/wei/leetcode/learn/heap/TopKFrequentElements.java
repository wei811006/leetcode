package wei.leetcode.learn.heap;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 347 Top K Frequent Elements.
 * <p>
 * Given a non-empty array of integers,
 * return the k most frequent elements.
 * <p>
 * 2020/3/4
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((x, y) -> x[0] - y[0]);
        for (Integer key : map.keySet()) {
            queue.offer(new int[]{map.get(key), key});
            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; ++i)
            result.add(queue.poll()[1]);
        return result;
    }

}
