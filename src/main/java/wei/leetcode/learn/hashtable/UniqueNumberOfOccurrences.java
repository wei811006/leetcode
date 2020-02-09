package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 1207 UniqueNumberOfOccurrences.
 * <p>
 * Given an array of integers arr,
 * write a function that returns true if and only
 * if the number of occurrences of each value in the array is unique.
 * <p>
 * 2020/2/9 2:19 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];

        for (int i : arr) {
            count[i + 1000]++;
        }

        Arrays.sort(count);

        for (int i = 2000; i > 0; i--) {
            if (count[i] == 0) break;
            if (count[i] == count[i - 1]) {
                return false;
            }
        }

        return true;
    }

}
