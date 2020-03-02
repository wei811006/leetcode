package wei.leetcode.learn.contest.contest178;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @InjectMocks
    private HowManyNumbersAreSmallerThanTheCurrentNumber howManyNumbersAreSmallerThanTheCurrentNumber;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{8,1,2,2,3},
                        new int[]{4,0,1,1,3}
                ),
                Arguments.of(
                        new int[]{6,5,4,8},
                        new int[]{2,1,0,3}
                ),
                Arguments.of(
                        new int[]{7,7,7,7},
                        new int[]{0,0,0,0}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void smallerNumbersThanCurrent(int[] nums, int[] check) {
        int[] result = howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(nums);

        assertThat(result).isEqualTo(check);
    }
}