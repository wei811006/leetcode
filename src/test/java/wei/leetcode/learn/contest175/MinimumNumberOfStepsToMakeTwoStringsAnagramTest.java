package wei.leetcode.learn.contest175;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MinimumNumberOfStepsToMakeTwoStringsAnagramTest {

    @InjectMocks
    private MinimumNumberOfStepsToMakeTwoStringsAnagram minimumNumberOfStepsToMakeTwoStringsAnagram;

    @ParameterizedTest
    @CsvSource({
            "bab,aba,1"
    })
    void minSteps(String s, String t, int check) {
        int result = minimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s, t);

        assertThat(result).isEqualTo(check);
    }
}