package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * 1323 Maximum69Number.
 * <p>
 * Given a positive integer num consisting only of digits 6 and 9.
 * <p>
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 * <p>
 * 2020/02/2020/2/15
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class Maximum69Number {

    public int maximum69Number(int num) {
        Stack<Integer> numStack = new Stack<>();
        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            numStack.push(remainder);
        }

        boolean first = true;
        int result = 0;
        while( !numStack.isEmpty() ) {
            int popNum = numStack.pop();

            if ( first && popNum == 6 ) {
                popNum = 9;
                first = false;
            }

            result = result * 10 + popNum;
        }

        return result;
    }

}
