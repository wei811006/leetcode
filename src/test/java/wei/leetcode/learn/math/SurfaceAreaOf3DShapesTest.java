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
class SurfaceAreaOf3DShapesTest {

    @InjectMocks
    private SurfaceAreaOf3DShapes surfaceAreaOf3DShapes;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{2}}, 10
                ),
                Arguments.of(
                        new int[][]{{1, 2}, {3, 4}}, 34
                ),
                Arguments.of(
                        new int[][]{{1, 0}, {0, 2}}, 16
                ),
                Arguments.of(
                        new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}, 32
                ),
                Arguments.of(
                        new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}, 46
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void surfaceArea(int[][] grid, int check) {
        int result = surfaceAreaOf3DShapes.surfaceArea(grid);

        assertThat(result).isEqualTo(check);
    }
}