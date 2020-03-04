package wei.leetcode.learn.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TopKFrequentElementsTest {

    @InjectMocks
    private TopKFrequentElements topKFrequentElements;

    static Stream<Arguments> getSource() {
        List<Integer> check1 = new ArrayList<>();
        check1.add(1);
        check1.add(2);

        List<Integer> check2 = new ArrayList<>();
        check2.add(1);

        return Stream.of(
                Arguments.of(
                        new int[]{1,1,1,2,2,3},2,check1
                ),
                Arguments.of(
                        new int[]{1},1, check2
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void topKFrequent(int[] nums, int k, List<Integer> check) {
        List<Integer> result = topKFrequentElements.topKFrequent(nums, k);

        assertThat(result).isEqualTo(check);
    }
}