package wei.leetcode.learn.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class KthLargestElementInAnArrayTest {

    @InjectMocks
    private KthLargestElementInAnArray kthLargestElementInAnArray;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{3,2,1,5,6,4},2,5
                ),
                Arguments.of(
                        new int[]{3,2,3,1,2,4,5,5,6},4,4
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void findKthLargest(int[] nums, int k, int check) {
        int result = kthLargestElementInAnArray.findKthLargest(nums, k);

        assertThat(result).isEqualTo(check);
    }
}