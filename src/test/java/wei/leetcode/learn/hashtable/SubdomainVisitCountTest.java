package wei.leetcode.learn.hashtable;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class SubdomainVisitCountTest {

    @InjectMocks
    private SubdomainVisitCount subdomainVisitCount;

    static Stream<Arguments> getSource() {
        String[] input1 = new String[]{"9001 discuss.leetcode.com"};
        List<String> check1 = new ArrayList<>();
        check1.add("9001 discuss.leetcode.com");
        check1.add("9001 leetcode.com");
        check1.add("9001 com");

        String[] input2 = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> check2 = new ArrayList<>();
        check2.add("901 mail.com");
        check2.add("50 yahoo.com");
        check2.add("900 google.mail.com");
        check2.add("5 wiki.org");
        check2.add("5 org");
        check2.add("1 intel.mail.com");
        check2.add("951 com");

        return Stream.of(
                Arguments.of(input1, check1),
                Arguments.of(input2, check2)
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void subdomainVisits(String[] cpdomains, List<String> check) {
        List<String> result = subdomainVisitCount.subdomainVisits(cpdomains);

        assertThat(result).isEqualTo(check);
    }
}