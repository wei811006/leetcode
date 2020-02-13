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
class IntersectionOfTwoArraysTest {

    @InjectMocks
    private IntersectionOfTwoArrays intersectionOfTwoArrays;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 2, 1},
                        new int[]{2, 2},
                        new int[]{2}
                ),
                Arguments.of(
                        new int[]{4, 9, 5},
                        new int[]{9, 4, 9, 8, 4},
                        new int[]{9, 4}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void intersection(int[] nums1, int[] nums2, int[] check) {
        int[] result = intersectionOfTwoArrays.intersection(nums1, nums2);

        assertThat(result).isEqualTo(check);
    }
}