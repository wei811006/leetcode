package wei.leetcode.learn.contest.contest178;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * HowManyNumbersAreSmallerThanTheCurrentNumber.
 * <p>
 * 2020/3/1
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int times = 0;
            for (int j = 0; j < length; j++) {
                if ( nums[j] < nums[i] ) times++;
            }
            result[i] = times;
        }

        return result;
    }
}
