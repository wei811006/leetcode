package wei.leetcode.learn.heap;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 451 Sort Characters By Frequency.
 * <p>
 * Given a string, sort it in decreasing order based on the frequency of characters.
 * <p>
 * 2020/3/5
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class SortCharactersByFrequency {

    class Pair implements Comparable<Pair> {
        char c;
        int count;

        public Pair(char c, int count) {
            this.c = c;
            this.count = count;
        }

        @Override
        public int compareTo(Pair o) {
            return o.count - this.count;
        }
    }

    public String frequencySort(String s) {
        int[] freq = new int[256];
        for( char c: s.toCharArray() ) {
            freq[c]++;
        }

        ArrayList<Pair> list = new ArrayList<>();
        for (char i = 0; i < 122; i++) {
            if(freq[i] != 0) {
                list.add(new Pair(i, freq[i]));
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(Pair pair: list) {
            while(pair.count > 0) {
                sb.append(pair.c);
                pair.count--;
            }
        }

        return sb.toString();
    }
}
