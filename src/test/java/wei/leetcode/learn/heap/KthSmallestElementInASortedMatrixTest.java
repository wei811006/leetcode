package wei.leetcode.learn.heap;

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
class KthSmallestElementInASortedMatrixTest {

    @InjectMocks
    private KthSmallestElementInASortedMatrix kthSmallestElementInASortedMatrix;

    static Stream<Arguments> getSource() {
        int[][] matrix1 = {{1,5,9},{10,11,13},{12,13,15}};
        return Stream.of(
                Arguments.of(
                        matrix1, 8, 13
                ),
                Arguments.of(
                        new int[][]{{-5}},1,-5
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void kthSmallest(int[][] matrix, int k, int check) {
        int result = kthSmallestElementInASortedMatrix.kthSmallest(matrix, k);

        assertThat(result).isEqualTo(check);
    }
}