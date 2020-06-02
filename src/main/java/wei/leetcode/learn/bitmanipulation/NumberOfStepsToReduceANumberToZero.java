package wei.leetcode.learn.bitmanipulation;

import org.springframework.stereotype.Component;

/**
 * 1342. Number of Steps to Reduce a Number to Zero.
 *
 * Given a non-negative integer num,
 * return the number of steps to reduce it to zero.
 * If the current number is even,
 * you have to divide it by 2,
 * otherwise, you have to subtract 1 from it.
 * <p>
 * 2020/6/2
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class NumberOfStepsToReduceANumberToZero {

    int step = 0;

    public int numberOfSteps (int num) {
        if ( num == 0 ) {
            return step;
        }
        if ( num % 2 == 0 ) {
            step++;
            return numberOfSteps(num/2);
        }
        if ( num % 2 == 1 ) {
            step++;
            return numberOfSteps(num-1);
        }
        return step;
    }
}
