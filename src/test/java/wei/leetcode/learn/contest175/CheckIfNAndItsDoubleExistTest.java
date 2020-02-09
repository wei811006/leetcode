package wei.leetcode.learn.contest175;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CheckIfNAndItsDoubleExistTest {

    @InjectMocks
    private CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(new int[]{10, 2, 5, 3}, true),
                Arguments.of(new int[]{7, 1, 14, 11}, true),
                Arguments.of(new int[]{3, 1, 7, 11}, false),
                Arguments.of(new int[]{-10, 12, -20, -8, 15}, true),
                Arguments.of(new int[]{0, 0}, true),
                Arguments.of(new int[]{-2, 0, 10, -19, 4, 6, -8}, false),
                Arguments.of(new int[]{102, -592, 457, 802, 98, -132, 883, 356, -857, 461, -453, 522, 250, 476, 991, 540, -852, -485, -637, 999, -803, -691, -880, 881, -584, 750, -124, 745, -909, -892, 304, -814, 868, 665, 50, -40, 26, -242, -797, -360, -918, -741, 88, -933, -93, 360, -738, 833, -191, 563, 449, 840, 806, -87, -950, 508, 74, -448, -815, -488, 639, -334}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void checkIfExist(int[] arr, boolean check) {
        boolean result = checkIfNAndItsDoubleExist.checkIfExist(arr);

        assertThat(result).isEqualTo(check);
    }
}