package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 884 UncommonWordsFromTwoSentences.
 * <p>
 * We are given two sentences A and B.
 * (A sentence is a string of space separated words.
 * Each word consists only of lowercase letters.)
 * <p>
 * A word is uncommon if it appears exactly once in one of the sentences,
 * and does not appear in the other sentence.
 * <p>
 * Return a list of all uncommon words.
 * <p>
 * You may return the list in any order.
 * <p>
 * 2020/02/2020/2/12
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for( String s: A.split(" ") ) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        for( String s: B.split(" ") ) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }

        List<String> uncommonList = new LinkedList<>();
        count.forEach((k, v) -> {
            if ( v == 1 ) {
                uncommonList.add(k);
            }
        });

        return uncommonList.toArray(new String[0]);
    }

}
