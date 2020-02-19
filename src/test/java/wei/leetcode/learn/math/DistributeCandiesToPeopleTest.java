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
class DistributeCandiesToPeopleTest {

    @InjectMocks
    private DistributeCandiesToPeople distributeCandiesToPeople;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        7, 4, new int[]{1, 2, 3, 1}
                ),
                Arguments.of(
                        10, 3, new int[]{5, 2, 3}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void distributeCandies(int candies, int num_people, int[] check) {
        int[] result = distributeCandiesToPeople.distributeCandies(candies, num_people);

        assertThat(result).isEqualTo(check);
    }
}