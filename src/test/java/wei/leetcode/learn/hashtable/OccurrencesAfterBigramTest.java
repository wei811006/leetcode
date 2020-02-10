package wei.leetcode.learn.hashtable;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class OccurrencesAfterBigramTest {

    @InjectMocks
    private OccurrencesAfterBigram occurrencesAfterBigram;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        "alice is a good girl she is a good student",
                        "a",
                        "good",
                        new String[]{"girl", "student"}
                ),
                Arguments.of(
                        "we will we will rock you",
                        "we",
                        "will",
                        new String[]{"we", "rock"}
                ),
                Arguments.of(
                        "obo jvezipre obo jnvavldde jvezipre jvezipre jnvavldde jvezipre jvezipre jvezipre y jnvavldde jnvavldde obo jnvavldde jnvavldde obo jnvavldde jnvavldde jvezipre",
                        "jnvavldde",
                        "y",
                        new String[]{}
                ),
                Arguments.of(
                        "jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa",
                        "kcyxdfnoa",
                        "jkypmsxd",
                        new String[]{"kcyxdfnoa", "kcyxdfnoa", "kcyxdfnoa"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void findOcurrences(String text, String first, String second, String[] check) {
        String[] result = occurrencesAfterBigram.findOcurrences(text, first, second);

        assertThat(result).isEqualTo(check);
    }
}