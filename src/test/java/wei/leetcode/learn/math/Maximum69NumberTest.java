package wei.leetcode.learn.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class Maximum69NumberTest {

    @InjectMocks
    private Maximum69Number maximum69Number;

    @ParameterizedTest
    @CsvSource({
            "9669,9969",
            "9996,9999",
            "9999,9999"
    })
    void maximum69Number(int num, int check) {
        int result = maximum69Number.maximum69Number(num);

        assertThat(result).isEqualTo(check);
    }
}