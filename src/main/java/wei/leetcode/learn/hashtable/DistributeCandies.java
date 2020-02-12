package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

/**
 * 575 Distribute Candies.
 * <p>
 * Given an integer array with even length,
 * where different numbers in this array represent
 * different kinds of candies.
 * Each number means one candy of the corresponding kind.
 * You need to distribute these candies equally in number to brother and sister.
 * Return the maximum number of kinds of candies the sister could gain.
 * <p>
 * 2020/02/2020/2/12
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class DistributeCandies {

    public int distributeCandies(int[] candies) {
        boolean[] kinds = new boolean[200001];
        final int half = candies.length / 2;

        int nk = 0;
        for (int kind : candies) {
            if (!kinds[kind + 100000]) {
                if (++nk == half) return half;
                kinds[kind + 100000] = true;
            }
        }

        return nk;
    }

}
