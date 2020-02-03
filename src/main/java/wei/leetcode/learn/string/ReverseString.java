package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

/**
 * 344 ReverseString.
 * <p>
 * Write a function that reverses a string. The input string is given as
 * an array of characters char[].
 * <p>
 * Do not allocate extra space for another array, you must do this by
 * modifying the input array in-place with O(1) extra memory.
 * <p>
 * You may assume all the characters consist of printable ascii characters.
 * <p>
 * 2020/2/3 8:34 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ReverseString {

    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1, max = s.length / 2; i < max; i++, j--) {
            s[i] = (char) (s[i] + s[j]);
            s[j] = (char) (s[i] - s[j]);
            s[i] = (char) (s[i] - s[j]);
        }
    }

}
