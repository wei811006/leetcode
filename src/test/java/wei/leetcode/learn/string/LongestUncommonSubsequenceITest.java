package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class LongestUncommonSubsequenceITest {

    @InjectMocks
    private LongestUncommonSubsequenceI longestUncommonSubsequenceI;

    @ParameterizedTest
    @CsvSource({
            "aba,cdc,3"
    })
    void findLUSlength(String a, String b, int check) {
        int result = longestUncommonSubsequenceI.findLUSlength(a, b);

        assertThat(result).isEqualTo(check);
    }
}