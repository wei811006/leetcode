package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CountBinarySubstringsTest {

    @InjectMocks
    private CountBinarySubstrings countBinarySubstrings;

    @ParameterizedTest
    @CsvSource({
            "00110011,6",
            "10101,4",
            "00110,3",
            "00100,2"
    })
    void countBinarySubstrings(String s, int check) {
        int result = countBinarySubstrings.countBinarySubstrings(s);

        assertThat(result).isEqualTo(check);
    }
}