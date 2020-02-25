package wei.leetcode.learn.stack;

import org.springframework.stereotype.Component;

/**
 * 682 Baseball Game.
 * <p>
 * You're now a baseball game point recorder.
 * <p>
 * Given a list of strings, each string can be one of the 4 following types:
 * <p>
 * 1. Integer (one round's score):
 * Directly represents the number of points you get in this round.
 * 2. "+" (one round's score):
 * Represents that the points you get in this round are
 * the sum of the last two valid round's points.
 * 3. "D" (one round's score):
 * Represents that the points you get in this round
 * are the doubled data of the last valid round's points.
 * 4. "C" (an operation, which isn't a round's score):
 * Represents the last valid round's points you get were invalid and should be removed.
 * <p>
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 * <p>
 * You need to return the sum of the points you could get in all the rounds.
 * <p>
 * 2020/2/25
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class BaseballGame {
    public int calPoints(String[] ops) {
        int sum = 0;
        int flag = -1;
        int[] nums = new int[ops.length];

        for ( String s: ops ) {
            int num = 0;
            if ( "C".equals(s) ) {
                sum -= nums[flag--];
            }
            else if ( "D".equals(s) ) {
                num = nums[flag] * 2;
                nums[++flag] = num;
            }
            else if ( "+".equals(s) ) {
                num = nums[flag] + nums[flag-1];
                nums[++flag] = num;
            }
            else {
                num = Integer.parseInt(s);
                nums[++flag] = num;
            }
            sum += num;
        }

        return sum;
    }
}
