package wei.leetcode.learn.array;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ToeplitzMatrixTest {

    @InjectMocks
    private ToeplitzMatrix toeplitzMatrix;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}},
                        true
                ),
                Arguments.of(
                        new int[][]{{1, 2}, {2, 2}},
                        false
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void isToeplitzMatrix(int[][] matrix, boolean check) {

        boolean result = toeplitzMatrix.isToeplitzMatrix(matrix);

        assertThat(result).isEqualTo(check);
    }
}