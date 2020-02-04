package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MaximumNumberOfBalloonsTest {

    @InjectMocks
    private MaximumNumberOfBalloons maximumNumberOfBalloons;

    @ParameterizedTest
    @CsvSource({
            "nlaebolko,1",
            "loonbalxballpoon,2",
            "leetcode,0",
            "balon,0"
    })
    void maxNumberOfBalloons(String text, int check) {
        int result = maximumNumberOfBalloons.maxNumberOfBalloons(text);

        assertThat(result).isEqualTo(check);
    }
}