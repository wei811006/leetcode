package wei.leetcode.learn.array;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class DayOfTheWeekTest {

    @InjectMocks
    private DayOfTheWeek dayOfTheWeek;

    @ParameterizedTest
    @CsvSource({
            "31,8,2019,Saturday",
            "18,7,1999,Sunday",
            "15,8,1993,Sunday"
    })
    void dayOfTheWeek(int day, int month, int year, String check) {
        String answer = dayOfTheWeek.dayOfTheWeek(day, month, year);

        assertThat(check).isEqualTo(answer);
    }
}