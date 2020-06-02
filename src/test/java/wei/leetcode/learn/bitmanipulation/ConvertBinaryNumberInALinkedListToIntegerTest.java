package wei.leetcode.learn.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ConvertBinaryNumberInALinkedListToIntegerTest {

    @InjectMocks
    private ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger;

    static Stream<Arguments> getSource() {
        ListNode arg1 = new ListNode(1, new ListNode(0, new ListNode(1)));

        ListNode arg2 = new ListNode(0);

        ListNode arg3 = new ListNode(1);

        return Stream.of(
                Arguments.of(arg1, 5),
                Arguments.of(arg2, 0),
                Arguments.of(arg3, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void getDecimalValue(ListNode head, int check) {
        assertThat(convertBinaryNumberInALinkedListToInteger.getDecimalValue(head)).isEqualTo(check);
    }
}