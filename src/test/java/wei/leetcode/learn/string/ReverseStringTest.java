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
class ReverseStringTest {

    @InjectMocks
    private ReverseString reverseString;

    static Stream<Arguments> getSource() {
        char[] s1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] check1 = new char[]{'o', 'l', 'l', 'e', 'h'};
        char[] s2 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        char[] check2 = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};

        return Stream.of(
                Arguments.of(s1, check1),
                Arguments.of(s2, check2)
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void reverseString(char[] s, char[] check) {
        reverseString.reverseString(s);

        assertThat(s).isEqualTo(check);
    }
}