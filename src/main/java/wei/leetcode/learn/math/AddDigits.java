package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

/**
 * 258 Add Digits.
 *
 * Given a non-negative integer num,
 * repeatedly add all its digits until the result has only one digit.
 * <p>
 * 2020/02/2020/2/24
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class AddDigits {

    public int addDigits(int num) {
        if (num == 0) return 0;
        int mod = num % (10 - 1);
        return mod == 0 ? 9 : mod;
//        int result = 0;
//        while ( num > 0) {
//            result += num % 10;
//            num /= 10;
//        }
//        return result >= 10 ? addDigits(result) : result;
    }
}
