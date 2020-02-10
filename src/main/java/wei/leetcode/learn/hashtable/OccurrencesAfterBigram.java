package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078 Occurrences After Bigram.
 * <p>
 * Given words first and second, consider occurrences in
 * some text of the form "first second third",
 * where second comes immediately after first, and third comes immediately after second.
 * <p>
 * For each such occurrence, add "third" to the answer,
 * and return the answer.
 * <p>
 * 2020/2/10 7:12 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class OccurrencesAfterBigram {

    public String[] findOcurrences(String text, String first, String second) {

        List<String> strings = new ArrayList<>();
        String[] t = text.split(" ");
        for (int i = 1, max = t.length -1 ; i < max; i++) {
            if ( first.equals(t[i-1]) &&  second.equals(t[i]) ) {
                strings.add(t[i+1]);
            }
        }

        String[] result = new String[strings.size()];
        return strings.toArray(result);
    }

}
