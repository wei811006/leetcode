package wei.leetcode.learn.bitmanipulation;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class NumberOfStepsToReduceANumberToZeroTest {

    @InjectMocks
    private NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero;

    @ParameterizedTest
    @CsvSource({
            "14,6",
            "8,4"
    })
    void numberOfSteps(int source, int check) {
        assertThat(numberOfStepsToReduceANumberToZero.numberOfSteps(source)).isEqualTo(check);
    }
}