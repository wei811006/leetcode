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
class GroupsOfSpecialEquivalentStringsTest {

    @InjectMocks
    private GroupsOfSpecialEquivalentStrings groupsOfSpecialEquivalentStrings;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(new String[]{"abcd","cdab","cbad","xyzz","zzxy","zzyx"}, 3),
                Arguments.of(new String[]{"abc","acb","bac","bca","cab","cba"}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void numSpecialEquivGroups(String[] a, int check) {
        int result = groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(a);

        assertThat(result).isEqualTo(check);
    }
}