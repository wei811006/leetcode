package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

/**
 * 868 Binary Gap.
 *
 * Given a positive integer N,
 * find and return the longest distance
 * between two consecutive 1's in the binary representation of N.
 *
 * If there aren't two consecutive 1's, return 0.
 * <p>
 * 2020/02/2020/2/18
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class BinaryGap {

    public int binaryGap(int N) {
        int max = 0;

        int distance = Integer.MIN_VALUE;
        while ( N > 0 ) {
            if ( (N & 1) == 1 ) {
                    max = Math.max(max, distance);
                distance = 1;
            }
            else {
                distance++;
            }
            N >>= 1;
        }

        return max;
    }

}
