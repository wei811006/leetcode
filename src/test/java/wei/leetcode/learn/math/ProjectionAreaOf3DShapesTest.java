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
class ProjectionAreaOf3DShapesTest {

    @InjectMocks
    private ProjectionAreaOf3DShapes projectionAreaOf3DShapes;

    static Stream<Arguments> getSource() {


        return Stream.of(
                Arguments.of(
                        new int[][]{{2}}, 5
                ),
                Arguments.of(
                        new int[][]{{1, 2}, {3, 4}}, 17
                ),
                Arguments.of(
                        new int[][]{{1,0},{0,2}}, 8
                ),
                Arguments.of(
                        new int[][]{{1,1,1},{1,0,1},{1,1,1}}, 14
                ),
                Arguments.of(
                        new int[][]{{2,2,2},{2,1,2},{2,2,2}},21
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void projectionArea(int[][] grid, int check) {
        int result = projectionAreaOf3DShapes.projectionArea(grid);

        assertThat(result).isEqualTo(check);
    }
}