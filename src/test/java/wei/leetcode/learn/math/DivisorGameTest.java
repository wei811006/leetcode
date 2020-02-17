package wei.leetcode.learn.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class DivisorGameTest {

    @InjectMocks
    private DivisorGame divisorGame;

    @ParameterizedTest
    @CsvSource({
            "2,true",
            "3,false"
    })
    void divisorGame(int N, boolean check) {
        boolean result = divisorGame.divisorGame(N);

        assertThat(result).isEqualTo(check);
    }
}