package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 937 ReorderDataInLogFiles.
 * <p>
 * You have an array of logs.  Each log is a space delimited string of words.
 * <p>
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 * <p>
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.
 * It is guaranteed that each log has at least one word after its identifier.
 * <p>
 * Reorder the logs so that all of the letter-logs come before any digit-log.
 * The letter-logs are ordered lexicographically ignoring identifier,
 * with the identifier used in case of ties.
 * The digit-logs should be put in their original order.
 * <p>
 * Return the final order of the logs.
 * <p>
 * 2020/2/8 10:12 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ReorderDataInLogFiles {


    public String[] reorderLogFiles(String[] logs) {
        int length = logs.length;
        int left = 0, right = length - 1;
        String[] result = new String[length];

        for (int i = length - 1; i >= 0; i--) {
            String str = logs[i];
            if (Character.isLetter(str.charAt(str.indexOf(' ') + 1))) {
                result[left++] = str;
            } else {
                result[right--] = str;
            }
        }
        Arrays.sort(result, 0, left, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int first = o1.indexOf(' ') + 1;
                int second = o2.indexOf(' ') + 1;
                while (first < o1.length() && second < o2.length()) {
                    if (o1.charAt(first) < o2.charAt(second)) {
                        return -1;
                    } else if (o1.charAt(first) > o2.charAt(second)) {
                        return 1;
                    }
                    first++;
                    second++;
                }
                return 0;
            }
        });

        return result;
    }

}
