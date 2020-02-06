package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ReverseOnlyLettersTest {

    @InjectMocks
    private ReverseOnlyLetters reverseOnlyLetters;

    @ParameterizedTest
    @CsvSource({
            "ab-cd,dc-ba",
            "a-bC-dEf-ghIj,j-Ih-gfE-dCba",
            "Test1ng-Leet=code-Q!,Qedo1ct-eeLg=ntse-T!"
    })
    void reverseOnlyLetters(String s, String check) {
        String result = reverseOnlyLetters.reverseOnlyLetters(s);

        assertThat(result).isEqualTo(check);
    }
}