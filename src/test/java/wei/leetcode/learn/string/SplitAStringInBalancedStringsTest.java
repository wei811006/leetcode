package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class SplitAStringInBalancedStringsTest {

    @InjectMocks
    private SplitAStringInBalancedStrings splitAStringInBalancedStrings;

    @ParameterizedTest
    @CsvSource({
            "RLRRLLRLRL,4",
            "RLLLLRRRLR,3",
            "LLLLRRRR,1",
            "RLRRRLLRLL,2"
    })
    void balancedStringSplit(String s, int check) {
        int result = splitAStringInBalancedStrings.balancedStringSplit(s);

        assertThat(check).isEqualTo(result);
    }
}