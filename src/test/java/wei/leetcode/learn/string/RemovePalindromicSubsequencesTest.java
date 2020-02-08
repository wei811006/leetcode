package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RemovePalindromicSubsequencesTest {

    @InjectMocks
    private RemovePalindromicSubsequences removePalindromicSubsequences;

    @ParameterizedTest
    @CsvSource({
            "ababa,1",
            "abb,2",
            "baabb,2"
    })
    void removePalindromeSub(String s, int check) {
        int result = removePalindromicSubsequences.removePalindromeSub(s);

        assertThat(result).isEqualTo(check);
    }
}