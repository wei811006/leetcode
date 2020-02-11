package wei.leetcode.learn.hashtable;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class IslandPerimeterTest {

    @InjectMocks
    private IslandPerimeter islandPerimeter;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}},
                        16
                ),
                Arguments.of(
                        new int[][]{{1,0}},
                        4
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void islandPerimeter(int[][] grid, int check) {
        int result = islandPerimeter.islandPerimeter(grid);

        assertThat(result).isEqualTo(check);
    }
}