package wei.leetcode.learn.heap;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 1046 Last Stone Weight.
 *
 * We have a collection of rocks,
 * each rock has a positive integer weight.
 *
 * Each turn, we choose the two heaviest rocks and smash them together.
 * Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 *
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed,
 * and the stone of weight y has new weight y-x.
 * At the end, there is at most 1 stone left.
 * Return the weight of this stone (or 0 if there are no stones left.)
 * <p>
 * 2020/3/2
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones) {
            queue.add(stone);
        }

        while ( queue.size() > 1 ) {
            int diff = queue.poll() - queue.poll();
            queue.add(diff);
        }

        return queue.peek();
    }

}
