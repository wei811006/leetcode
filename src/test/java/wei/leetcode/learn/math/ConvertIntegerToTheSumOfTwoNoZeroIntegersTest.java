package wei.leetcode.learn.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ConvertIntegerToTheSumOfTwoNoZeroIntegersTest {

    @InjectMocks
    private ConvertIntegerToTheSumOfTwoNoZeroIntegers convertIntegerToTheSumOfTwoNoZeroIntegers;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        2, new int[]{1, 1}
                ),
                Arguments.of(
                        11, new int[]{2, 9}
                ),
                Arguments.of(
                        10000, new int[]{1, 9999}
                ),
                Arguments.of(
                        69, new int[]{1, 68}
                ),
                Arguments.of(
                        1010, new int[]{11, 999}
                ),
                Arguments.of(
                        4102, new int[]{111, 3991}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void getNoZeroIntegers(int n, int[] check) {
        int[] result = convertIntegerToTheSumOfTwoNoZeroIntegers.getNoZeroIntegers(n);

        assertThat(result).isEqualTo(check);
    }
}