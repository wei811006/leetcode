package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RotatedDigitsTest {

    @InjectMocks
    private RotatedDigits rotatedDigits;

    @ParameterizedTest
    @CsvSource({
            "10,4",
            "2,1",
            "857,247"
    })
    void rotatedDigits(int n, int check) {
        int result = rotatedDigits.rotatedDigits(n);

        assertThat(result).isEqualTo(check);
    }
}