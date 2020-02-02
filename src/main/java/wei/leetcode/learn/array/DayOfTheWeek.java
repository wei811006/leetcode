package wei.leetcode.learn.array;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1185 DayOfTheWeek.
 *
 * 2020/1/30 10:05 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Service
public class DayOfTheWeek {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date begin = format.parse("1970-01-01");
        Date end = format.parse("1999-07-31");

        System.out.println((end.getTime() - begin.getTime())/(24*60*60*1000));
    }

    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int total = 0;
        for (int i=1971; i<year; i++) {
            if (i%4 == 0) {
                total++;
            }
            total += 365;
        }
        if (year%4 == 0) {
            dayOfMonth[1] = 29;
        }
        for (int j=0; j<month-1; j++) {
            total += dayOfMonth[j];
        }
        total += day - 1;
        return week[(total + 5)%7];
    }

}
