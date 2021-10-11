package wei.leetcode.learn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MergeTwoSortedListsTest {

    static Stream<Arguments> getSource() {

        return Stream.of(
                Arguments.of(
                        new ListNode(1).next = new ListNode(2)
                ),
                Arguments.of(
                        "",
                        new String[]{"dog","racecar","car"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void mergeTwoLists() {
    }
}