package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 1170 CompareStringsByFrequencyOfTheSmallestCharacter.
 * <p>
 * Let's define a function f(s) over a non-empty string s,
 * which calculates the frequency of the smallest character in s.
 * For example, if s = "dcce" then f(s) = 2
 * because the smallest character is "c" and its frequency is 2.
 * <p>
 * Now, given string arrays queries and words,
 * return an integer array answer,
 * where each answer[i] is the number of words such that
 * f(queries[i]) < f(W), where W is a word in words.
 * <p>
 * 2020/2/5 9:11 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class CompareStringsByFrequencyOfTheSmallestCharacter {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] result = new int[queries.length];
        int[] queriesCount = culNum(queries);
        int[] wordsCount = culNum(words);

        Arrays.sort(wordsCount);

        int flag = 0;
        for ( int i: queriesCount ) {
            for ( int j = wordsCount.length - 1; j >= 0; j-- ) {
                if ( wordsCount[j] <= i ) {
                    break;
                }
                result[flag]++;
            }
            flag++;
        }

        return result;
    }

    private int[] culNum(String[] words) {
        int[] result = new int[words.length];
        int[] alphabet = new int[26];
        for (int i = 0, max = words.length; i < max; i++) {

            for (char c : words[i].toCharArray()) {
                alphabet[c - 'a']++;
            }
            for (int a : alphabet) {
                if (a != 0) {
                    result[i] = a;
                    break;
                }
            }
            alphabet = new int[26];
        }
        return result;
    }
}
