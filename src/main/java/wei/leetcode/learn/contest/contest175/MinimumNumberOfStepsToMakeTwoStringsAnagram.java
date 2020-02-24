package wei.leetcode.learn.contest.contest175;

import org.springframework.stereotype.Component;

/**
 * 5333 MinimumNumberOfStepsToMakeTwoStringsAnagram.
 * TODO
 * 2020/2/9 10:52 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    public int minSteps(String s, String t) {
        int length = s.length();
        int[] check1 = new int[26];
        int[] check2 = new int[26];

        for ( int i = 0; i < length; i++ ) {
            check1[s.charAt(i) - 'a']++;
            check2[t.charAt(i) - 'a']++;
        }

        int result = 0;
        for( int i = 0; i < 26; i++ ) {
            result += Math.abs(check1[i] - check2[i]);
        }

        return result/2;
    }

}
