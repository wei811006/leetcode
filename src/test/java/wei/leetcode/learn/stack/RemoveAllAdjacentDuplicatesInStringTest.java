package wei.leetcode.learn.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RemoveAllAdjacentDuplicatesInStringTest {

    @InjectMocks
    private RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString;

    @ParameterizedTest
    @CsvSource({
            "abbaca,ca"
    })
    void removeDuplicates(String S, String check) {
        String result = removeAllAdjacentDuplicatesInString.removeDuplicates(S);

        assertThat(result).isEqualTo(check);
    }
}