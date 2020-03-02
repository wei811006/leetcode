package wei.leetcode.learn.contest.contest178;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.TreeMap;

/**
 * RankTeamsByVotes.
 * TODO
 * <p>
 * 2020/3/1
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class RankTeamsByVotes {

    public String rankTeams(String[] votes) {

        Map<Character, Integer> map = new TreeMap<>();

        for(String vote: votes) {
            for (int i = 0; i < vote.length(); i++) {
                int count = map.getOrDefault(vote.charAt(i), 0);
                count += vote.length() - i;
                map.put(vote.charAt(i), count);
            }
        }

        String result = "";
        int max;
        do {
            max = 0;
            char c = 'A';
            for (Map.Entry<Character, Integer> entry: map.entrySet() ) {
                if ( entry.getValue() > max ) {
                    max = entry.getValue();
                    c = entry.getKey();
                }
            }
            if (max != 0) {
                map.remove(c);
                result += (char) (c);
            }
        } while (max != 0);

        return result;
    }
}
