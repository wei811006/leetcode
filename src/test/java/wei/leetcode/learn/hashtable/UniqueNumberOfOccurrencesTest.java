package wei.leetcode.learn.hashtable;

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
class UniqueNumberOfOccurrencesTest {

    @InjectMocks
    private UniqueNumberOfOccurrences uniqueNumberOfOccurrences;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,2,2,1,1,3},
                        true
                ),
                Arguments.of(
                        new int[]{1,2},
                        false
                ),
                Arguments.of(
                        new int[]{-3,0,1,-3,1,1,1,-3,10,0},
                        true
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void uniqueOccurrences(int[] arr, boolean check) {
        boolean result = uniqueNumberOfOccurrences.uniqueOccurrences(arr);

        assertThat(result).isEqualTo(check);
    }
}