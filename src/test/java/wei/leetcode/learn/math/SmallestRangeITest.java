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
class SmallestRangeITest {

    @InjectMocks
    private SmallestRangeI smallestRangeI;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{1}, 0, 0
                ),
                Arguments.of(
                        new int[]{0, 10}, 2, 6
                ),
                Arguments.of(
                        new int[]{1, 3, 6}, 3, 0
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void smallestRangeI(int[] A, int K, int check) {
        int result = smallestRangeI.smallestRangeI(A, K);

        assertThat(result).isEqualTo(check);
    }
}