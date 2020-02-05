package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CompareStringsByFrequencyOfTheSmallestCharacterTest {

    @InjectMocks
    private CompareStringsByFrequencyOfTheSmallestCharacter compareStringsByFrequencyOfTheSmallestCharacter;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new String[]{"cbd"},
                        new String[]{"zaaaz"},
                        new int[]{1}
                ),
                Arguments.of(
                        new String[]{"bbb", "cc"},
                        new String[]{"a", "aa", "aaa", "aaaa"},
                        new int[]{1, 2}
                ),
                Arguments.of(
                        new String[]{"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"},
                        new String[]{"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"},
                        new int[]{6,1,1,2,3,3,3,1,3,2}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void numSmallerByFrequency(String[] queries, String[] words, int[] check) {
        int[] result = compareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(queries, words);

        assertThat(result).isEqualTo(check);
    }
}