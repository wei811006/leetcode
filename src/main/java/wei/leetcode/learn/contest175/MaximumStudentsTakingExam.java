package wei.leetcode.learn.contest175;

import org.springframework.stereotype.Component;

/**
 * 5335 MaximumStudentsTakingExam.
 * TODO
 * 2020/2/9 10:58 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class MaximumStudentsTakingExam {

    public int maxStudents(char[][] seats) {
        int maxI = seats.length;
        int maxJ = seats[0].length;

        int result = 0;
        for (int i = 1; i < maxI; i++) {
            for (int j = 0; j < maxJ; j++) {
                if (j == 0 && (allow(seats[i][j + 1]) || allow(seats[i - 1][j + 1]))) {
                    continue;
                }
                if (j == maxJ - 1 && (allow(seats[i][j - 1]) || allow(seats[i - 1][j - 1]))) {
                    continue;
                }
                if (allow(seats[i][j + 1])
                        || allow(seats[i - 1][j + 1])
                        || allow(seats[i][j - 1])
                        || allow(seats[i - 1][j - 1])) {
                    continue;
                }
                result++;
            }
        }

        return result;
    }

    private boolean allow(char c) {
        if (c == '.') return true;
        return false;
    }
}
