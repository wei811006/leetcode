package wei.leetcode.learn.array;

import org.springframework.stereotype.Component;

/**
 * 1217 PlayWithChips.
 * There are some chips, and the i-th chip is at position chips[i].
 *
 * You can perform any of the two following types of moves any number of times (possibly zero) on any chip:
 *
 * Move the i-th chip by 2 units to the left or to the right with a cost of 0.
 * Move the i-th chip by 1 unit to the left or to the right with a cost of 1.
 * There can be two or more chips at the same position initially.
 *
 * Return the minimum cost needed to move all the chips to the same position (any position).
 * 2020/1/31 9:17 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class PlayWithChips {

    public int minCostToMoveChips(int[] chips) {
        int[] temp = new int[2];
        for(int a : chips){
            temp[a%2]++;
        }
        return Math.min(temp[0], temp[1]);
    }
}
