package wei.leetcode.learn.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AddDigitsTest {

    @InjectMocks
    private AddDigits addDigits;

    @ParameterizedTest
    @CsvSource({
            "38,2"
    })
    void addDigits(int num, int check) {
        int result = addDigits.addDigits(num);

        assertThat(result).isEqualTo(check);
    }
}