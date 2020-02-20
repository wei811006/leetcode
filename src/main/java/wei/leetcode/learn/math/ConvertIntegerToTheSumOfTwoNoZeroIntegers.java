package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

/**
 * 1317 Convert Integer to the Sum of Two No-Zero Integers.
 * <p>
 * Given an integer n.
 * No-Zero integer is a positive integer which doesn't contain any 0 in its decimal representation.
 * <p>
 * Return a list of two integers [A, B] where:
 * <p>
 * A and B are No-Zero integers.
 * A + B = n
 * It's guarateed that there is at least one valid solution.
 * If there are many valid solutions you can return any of them.
 * <p>
 * 2020/02/2020/2/20
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {

    public int[] getNoZeroIntegers(int n) {
        int diff = 1;

        while( containerZero(n - diff) || containerZero(diff) ) {
            diff++;
        }
        return new int[]{diff, n - diff};
    }

    private boolean containerZero(int num) {
        return String.valueOf(num).contains("0");
    }
}
