package wei.leetcode.learn.hashtable;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class UncommonWordsFromTwoSentencesTest {

    @InjectMocks
    private UncommonWordsFromTwoSentences uncommonWordsFromTwoSentences;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        "this apple is sweet",
                        "this apple is sour",
                        new String[]{"sweet","sour"}
                ),
                Arguments.of(
                        "apple apple",
                        "banana",
                        new String[]{"banana"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void uncommonFromSentences(String a, String b, String[] check) {
        String[] result = uncommonWordsFromTwoSentences.uncommonFromSentences(a, b);

        assertThat(result).isEqualTo(check);
    }
}