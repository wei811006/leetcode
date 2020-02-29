package wei.leetcode.learn.sort;

import org.assertj.core.util.Streams;
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
class SortIntegersByTheNumberOf1BitsTest {

    @InjectMocks
    private SortIntegersByTheNumberOf1Bits sortIntegersByTheNumberOf1Bits;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{0,1,2,3,4,5,6,7,8},
                        new int[]{0,1,2,4,8,3,5,6,7}
                ),
                Arguments.of(
                        new int[]{1024,512,256,128,64,32,16,8,4,2,1},
                        new int[]{1,2,4,8,16,32,64,128,256,512,1024}
                ),
                Arguments.of(
                        new int[]{10000,10000},
                        new int[]{10000,10000}
                ),
                Arguments.of(
                        new int[]{2,3,5,7,11,13,17,19},
                        new int[]{2,3,5,17,7,11,13,19}
                ),
                Arguments.of(
                        new int[]{10,100,1000,10000},
                        new int[]{10,100,10000,1000}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void sortByBits(int[] arr, int[] check) {
        int[] result = sortIntegersByTheNumberOf1Bits.sortByBits(arr);

        assertThat(result).isEqualTo(check);
    }
}