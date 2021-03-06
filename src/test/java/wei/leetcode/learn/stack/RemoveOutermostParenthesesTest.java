package wei.leetcode.learn.stack;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RemoveOutermostParenthesesTest {

    @InjectMocks
    private RemoveOutermostParentheses removeOutermostParentheses;

    @ParameterizedTest
    @CsvSource({
            "(()())(()),()()()",
            "(()())(())(()(())),()()()()(())"
    })
    void removeOuterParentheses(String S, String check) {
        String result = removeOutermostParentheses.removeOuterParentheses(S);

        assertThat(result).isEqualTo(check);
    }
}