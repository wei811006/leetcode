package wei.leetcode.learn.heap;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class LastStoneWeightTest {

    @InjectMocks
    private LastStoneWeight lastStoneWeight;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{2, 7, 4, 1, 8, 1}, 1
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void lastStoneWeight(int[] stones, int check) {
        int result = lastStoneWeight.lastStoneWeight(stones);

        assertThat(result).isEqualTo(check);
    }
}