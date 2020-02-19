package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

/**
 * 1103 Distribute Candies to People.
 *
 * We distribute some number of candies,
 * to a row of n = num_people people in the following way:
 *
 * We then give 1 candy to the first person,
 * 2 candies to the second person,
 * and so on until we give n candies to the last person.
 *
 * Then, we go back to the start of the row,
 * giving n + 1 candies to the first person,
 * n + 2 candies to the second person,
 * and so on until we give 2 * n candies to the last person.
 *
 * This process repeats (with us giving one more candy each time,
 * and moving to the start of the row after we reach the end) until we run out of candies.
 * The last person will receive all of our remaining candies
 * (not necessarily one more than the previous gift).
 *
 * Return an array (of length num_people and sum candies)
 * that represents the final distribution of candies.
 * <p>
 * 2020/02/2020/2/19
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class DistributeCandiesToPeople {

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];

        for( int i = 0, num = 1; candies > 0; num++) {
            if ( num > candies ) {
                num = candies;
            }
            result[i] += num;
            candies -= num;

            i = (i+1) % num_people;
        }

        return result;
    }
}
