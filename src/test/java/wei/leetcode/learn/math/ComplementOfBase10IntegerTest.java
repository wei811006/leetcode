package wei.leetcode.learn.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ComplementOfBase10IntegerTest {

    @InjectMocks
    private ComplementOfBase10Integer complementOfBase10Integer;

    @ParameterizedTest
    @CsvSource({
            "5,2",
            "7,0",
            "10,5"
    })
    void bitwiseComplement(int N, int check) {
        int result = complementOfBase10Integer.bitwiseComplement(N);

        assertThat(result).isEqualTo(check);
    }
}