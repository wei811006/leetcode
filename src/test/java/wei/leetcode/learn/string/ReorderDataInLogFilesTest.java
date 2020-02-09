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
class ReorderDataInLogFilesTest {

    @InjectMocks
    private ReorderDataInLogFiles reorderDataInLogFiles;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"},
                        new String[]{"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"}
                ),
                Arguments.of(
                        new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"},
                        new String[]{"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void reorderLogFiles(String[] logs, String[] check) {
        String[] result = reorderDataInLogFiles.reorderLogFiles(logs);

        assertThat(result).isEqualTo(check);
    }
}