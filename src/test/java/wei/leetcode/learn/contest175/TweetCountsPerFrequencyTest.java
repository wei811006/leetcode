package wei.leetcode.learn.contest175;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class TweetCountsPerFrequencyTest {

    @InjectMocks
    private TweetCounts tweetCounts;

    @Test
    @Disabled
    public void test1() {
        tweetCounts.recordTweet("tweet3", 0);
        tweetCounts.recordTweet("tweet3", 60);
        tweetCounts.recordTweet("tweet3", 10);

        assertThat(
                tweetCounts.getTweetCountsPerFrequency(
                        "minute",
                        "tweet3",
                        0,
                        59)
        ).isEqualTo(new ArrayList<>().add(2));
    }

}