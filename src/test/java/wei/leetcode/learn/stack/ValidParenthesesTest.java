package wei.leetcode.learn.stack;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ValidParenthesesTest {

    @InjectMocks
    private ValidParentheses validParentheses;

    @ParameterizedTest
    @CsvSource({
            "(),true",
            "()[]{},true",
            "(],false",
            "([)],false",
            "{[]},true",
            "[,false",
            "],false"
    })
    void isValid(String s, boolean check) {
        boolean result = validParentheses.isValid(s);

        assertThat(result).isEqualTo(check);
    }
}