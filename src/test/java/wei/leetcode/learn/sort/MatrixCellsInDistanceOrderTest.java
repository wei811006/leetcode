package wei.leetcode.learn.sort;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MatrixCellsInDistanceOrderTest {

    @InjectMocks
    private MatrixCellsInDistanceOrder matrixCellsInDistanceOrder;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        1, 2, 0, 0, new int[][]{{0, 0}, {0, 1}}
                ),
                Arguments.of(
                        2, 2, 0, 1, new int[][]{{0, 1}, {0, 0}, {1, 1}, {1, 0}}
                ),
                Arguments.of(
                        2, 3, 1, 2, new int[][]{{1, 2}, {0, 2}, {1, 1}, {0, 1}, {1, 0}, {0, 0}}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void allCellsDistOrder(int R, int C, int r0, int c0, int[][] check) {
        int[][] result = matrixCellsInDistanceOrder.allCellsDistOrder(R, C, r0, c0);

        assertThat(result).isEqualTo(check);
    }
}