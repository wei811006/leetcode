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
class TransposeMatrixTest {

    @InjectMocks
    private TransposeMatrix transposeMatrix;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}
                ),
                Arguments.of(
                        new int[][]{{1, 2, 3}, {4, 5, 6}},
                        new int[][]{{1, 4}, {2, 5}, {3, 6}}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void transpose(int[][] a, int[][] check) {

        int[][] result = transposeMatrix.transpose(a);

        assertThat(result).isEqualTo(check);
    }
}