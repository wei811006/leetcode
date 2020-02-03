package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ReverseWordsInAStringIIITest {

    @InjectMocks
    private ReverseWordsInAStringIII reverseWordsInAStringIII;

    @ParameterizedTest
    @CsvSource({
            "Let's take LeetCode contest,s'teL ekat edoCteeL tsetnoc"
    })
    void reverseWords(String s, String check) {
        String result = reverseWordsInAStringIII.reverseWords(s);

        assertThat(result).isEqualTo(check);
    }
}