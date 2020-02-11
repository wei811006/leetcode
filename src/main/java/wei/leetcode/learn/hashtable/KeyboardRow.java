package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * KeyboardRow
 * Given a List of words,
 * return the words that can be typed using letters of alphabet on
 * only one row's of American keyboard like the image below.
 * <p>
 * 2020/02/11
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class KeyboardRow {

    public String[] findWords(String[] words) {
        int[] map = new int[128];
        for (char c : "qwertyuiopQWERTYUIOP".toCharArray()) map[c] = 1;
        for (char c : "asdfghjklASDFGHJKL".toCharArray()) map[c] = 2;
        for (char c : "zxcvbnmZXCVBNM".toCharArray()) map[c] = 3;
        List<String> l = new ArrayList<>();
        tag:
        for (String w : words) {
            int prev = -1;
            for (char c : w.toCharArray()) {
                if (prev == -1) prev = map[c];
                else if (map[c] != prev) continue tag;
            }
            l.add(w);
        }
        return l.toArray(new String[0]);

    }
}