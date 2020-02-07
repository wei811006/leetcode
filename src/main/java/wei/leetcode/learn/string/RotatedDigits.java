package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

/**
 * 788 RotatedDigits.
 * <p>
 * X is a good number if after rotating each digit individually by 180 degrees,
 * we get a valid number that is different from X.
 * Each digit must be rotated - we cannot choose to leave it alone.
 * <p>
 * A number is valid if each digit remains a digit after rotation.
 * 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other;
 * 6 and 9 rotate to each other, and the rest of the numbers do
 * not rotate to any other number and become invalid.
 * <p>
 * Now given a positive number N, how many numbers X from 1 to N are good?
 * <p>
 * 2020/2/7 9:13 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class RotatedDigits {

    public int rotatedDigits(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            String check = String.valueOf(i);
            if (check.contains("3")
                    || check.contains("4")
                    || check.contains("7")) {
                continue;
            }
            if (check.contains("2")
                    || check.contains("5")
                    || check.contains("6")
                    || check.contains("9")
            ) {
                result++;
            }
        }
        return result;
    }

}
