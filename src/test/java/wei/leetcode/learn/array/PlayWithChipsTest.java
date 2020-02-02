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
class PlayWithChipsTest {

    @InjectMocks
    private PlayWithChips playWithChips;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 1),
                Arguments.of(new int[]{2, 2, 2, 3, 3}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void minCostToMoveChips(int[] chips, int check) {

        int result = playWithChips.minCostToMoveChips(chips);

        assertThat(check).isEqualTo(result);
    }
}