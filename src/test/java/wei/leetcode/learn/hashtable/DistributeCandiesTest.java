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
class DistributeCandiesTest {

    @InjectMocks
    private DistributeCandies distributeCandies;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,1,2,2,3,3},
                        3
                ),
                Arguments.of(
                        new int[]{1,1,2,3},
                        2
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void distributeCandies(int[] candies, int check) {
        int result = distributeCandies.distributeCandies(candies);

        assertThat(result).isEqualTo(check);
    }
}