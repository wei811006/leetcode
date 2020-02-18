package wei.leetcode.learn.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class BinaryGapTest {

    @InjectMocks
    private BinaryGap binaryGap;

    @ParameterizedTest
    @CsvSource({
            "22,2",
            "5,2",
            "6,1",
            "8,0"
    })
    void binaryGap(int N, int check) {
        int result = binaryGap.binaryGap(N);

        assertThat(result).isEqualTo(check);
    }
}