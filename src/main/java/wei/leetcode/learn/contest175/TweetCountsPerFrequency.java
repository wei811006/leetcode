package wei.leetcode.learn.contest175;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 5334 TweetCountsPerFrequency.
 * TODO
 * 2020/2/9 11:20 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class TweetCountsPerFrequency {

}

@Component
class TweetCounts {

    private Map<String, List<Integer>> data;

    public TweetCounts() {
        data = new HashMap<>();
    }

    public void recordTweet(String tweetName, int time) {
        List<Integer> times;

        if ( !data.containsKey(tweetName) ) {
            times = new ArrayList<>();
        }
        else {
            times = data.get(tweetName);
        }
        times.add(time);

        Collections.sort(times);

        data.put(tweetName, times);
    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        List<Integer> times = data.get(tweetName);


        for ( Integer time: times ) {
            if ( time < startTime ) {
                continue;
            }
            if ( time > endTime ) {
                break;
            }

        }

        List<Integer> result = new ArrayList<>();
        return  result;
    }
}