package wei.leetcode.learn.stack;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class BackspaceStringCompareTest {

    @InjectMocks
    private BackspaceStringCompare backspaceStringCompare;

    @ParameterizedTest
    @CsvSource({
            "ab#c,ad#c,true",
            "ab##,c#d#,true",
            "a##c,#a#c,true",
            "a#c,b,false",
            "y#fo##f,y#f#o##f,true"
    })
    void backspaceCompare(String S, String T, boolean check) {
        boolean result = backspaceStringCompare.backspaceCompare(S, T);

        assertThat(result).isEqualTo(check);
    }
}