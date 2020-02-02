package wei.leetcode.learn.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class DecryptStringFromAlphabetToIntegerMappingTest {

    @InjectMocks
    private DecryptStringFromAlphabetToIntegerMapping decryptStringFromAlphabetToIntegerMapping;

    @ParameterizedTest
    @CsvSource({
            "10#11#12,jkab",
            "1326#,acz",
            "25#,y",
            "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#,abcdefghijklmnopqrstuvwxyz"
    })
    void freqAlphabets(String s, String check) {
        String result = decryptStringFromAlphabetToIntegerMapping.freqAlphabets(s);

        assertThat(check).isEqualTo(result);
    }
}