package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * IntersectionOfTwoArrays.
 * <p>
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * 2020/02/2020/2/13
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int flag1 = 0, flag2 = 0, max1 = nums1.length, max2 = nums2.length;

        Set<Integer> intersection = new HashSet<>();
        while( flag1 < max1 && flag2 < max2 ) {
            int num1 = nums1[flag1], num2 = nums2[flag2];

            if ( num1 == num2 ) {
                intersection.add(num1);
                flag1++;
                flag2++;
            }
            else if ( num1 > num2 ) {
                flag2++;
            }
            else if ( num1 < num2 ) {
                flag1++;
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for ( int n: intersection ) {
            result[i++] = n;
        }

        return result;
    }

}
