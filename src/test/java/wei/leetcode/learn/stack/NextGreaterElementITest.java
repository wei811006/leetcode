package wei.leetcode.learn.stack;

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
class NextGreaterElementITest {

    @InjectMocks
    private NextGreaterElementI nextGreaterElementI;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{4,1,2},new int[]{1,3,4,2}, new int[]{-1,3,-1}
                ),
                Arguments.of(
                        new int[]{2,4},new int[]{1,2,3,4}, new int[]{3,-1}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void nextGreaterElement(int[] nums1, int[] nums2, int[] check) {
        int[] result = nextGreaterElementI.nextGreaterElement(nums1, nums2);

        assertThat(result).isEqualTo(check);
    }
}