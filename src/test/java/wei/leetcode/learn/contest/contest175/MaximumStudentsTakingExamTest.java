package wei.leetcode.learn.contest.contest175;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MaximumStudentsTakingExamTest {

    @InjectMocks
    private MaximumStudentsTakingExam maximumStudentsTakingExam;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new char[][]{{'#','.','#','#','.','#'},
                                {'.','#','#','#','#','.'},
                                {'#','.','#','#','.','#'}},
                        4
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    @Disabled
    void maxStudents(char[][] seats, int check) {
        int result = maximumStudentsTakingExam.maxStudents(seats);

        assertThat(result).isEqualTo(check);
    }
}