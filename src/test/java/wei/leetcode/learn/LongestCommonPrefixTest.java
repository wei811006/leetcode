package wei.leetcode.learn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LongestCommonPrefixTest {

    @InjectMocks
    LongestCommonPrefix longestCommonPrefix;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        "fi",
                        new String[]{"flower","flow","flight"}
                ),
                Arguments.of(
                        "",
                        new String[]{"dog","racecar","car"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void longestCommonPrefix(String check, String[] strs) {
        String result = longestCommonPrefix.longestCommonPrefix(strs);

        assertThat(result).isEqualTo(check);
    }
}