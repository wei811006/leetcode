package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

/**
 * 1221 SplitAStringInBalancedStrings.
 * <p>
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * Return the maximum amount of splitted balanced strings.
 * <p>
 * 2020/2/2 12:57 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class SplitAStringInBalancedStrings {

    /**
     * @param s
     * @return
     */
    public int balancedStringSplit(String s) {

        int result = 0;
        int flag = 0;
        for (char c: s.toCharArray()) {
            if ( 'L' == c ) flag++;
            if ( 'R' == c ) flag--;
            if ( flag == 0 ) result++;
        }

        return result;
    }
}
