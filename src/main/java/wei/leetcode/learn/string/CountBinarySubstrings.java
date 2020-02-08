package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

/**
 * 696 CountBinarySubstrings.
 *
 * Give a string s, count the number of non-empty (contiguous)
 * substrings that have the same number of 0's and 1's,
 * and all the 0's and all the 1's in these substrings are grouped consecutively.
 *
 * Substrings that occur multiple times are counted the number of times they occur.
 *
 * 2020/2/7 10:46 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int length = s.length();

        if ( length <= 1) return 0;
        int preLen = 0, curLen = 1, result = 0;
        char[] cr = s.toCharArray();
        for( int i = 1; i < length; i++ ) {
            if ( cr[i] == cr[i-1] ) {
                curLen++;
            }
            else {
                preLen = curLen;
                curLen = 1;
            }
            if ( preLen >= curLen ) {
                result++;
            }
        }

        return result;
    }
}
