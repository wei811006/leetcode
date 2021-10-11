package wei.leetcode.learn.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PalindromeNumberTest {

    @InjectMocks
    PalindromeNumber palindromeNumber;

    @ParameterizedTest()
    @CsvSource({
            "121,true",
            "-121,false",
            "10,false"
    })
    void isPalindrome(int matrix, boolean check) {
        boolean result = palindromeNumber.isPalindrome(matrix);

        assertThat(result).isEqualTo(check);
    }
}