package wei.leetcode.learn.stack;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class BaseballGameTest {

    @InjectMocks
    private BaseballGame baseballGame;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new String[]{"5", "2", "C", "D", "+"}, 30
                ),
                Arguments.of(
                        new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}, 27
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void calPoints(String[] ops, int check) {
        int result = baseballGame.calPoints(ops);

        assertThat(result).isEqualTo(check);
    }
}