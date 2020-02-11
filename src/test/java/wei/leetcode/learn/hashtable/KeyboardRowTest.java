package wei.leetcode.learn.hashtable;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class KeyboardRowTest {

    @InjectMocks
    private KeyboardRow keyboardRow;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new String[]{"Hello", "Alaska", "Dad", "Peace"},
                        new String[]{"Alaska", "Dad"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void findWords(String[] words, String[] check) {
        String[] result = keyboardRow.findWords(words);

        assertThat(result).isEqualTo(check);
    }
}