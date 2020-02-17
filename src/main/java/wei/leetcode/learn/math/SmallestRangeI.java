package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

/**
 * 908 Smallest Range I.
 * <p>
 * Given an array A of integers, for each integer A[i]
 * we may choose any x with -K <= x <= K, and add x to A[i].
 * <p>
 * After this process, we have some array B.
 * <p>
 * Return the smallest possible difference
 * between the maximum value of B and the minimum value of B.
 * <p>
 * 2020/02/2020/2/17
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class SmallestRangeI {

    public int smallestRangeI(int[] A, int K) {
        if (A.length < 2) return 0;

        int max = A[0], min = A[0];
        for (int i = 1, length = A.length; i < length; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }

        int diff = max - min - K*2;
        return diff > 0 ? diff: 0;
    }
}
