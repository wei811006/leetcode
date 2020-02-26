package wei.leetcode.learn.stack;

import org.springframework.stereotype.Component;

/**
 * 496 Next Greater Element I.
 *
 * You are given two arrays (without duplicates) nums1 and nums2
 * where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 *
 * The Next Greater Number of a number x in nums1 is
 * the first greater number to its right in nums2.
 * If it does not exist, output -1 for this number.
 * <p>
 * 2020/2/26
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0, length = nums1.length; i < length; i++) {
            int num = nums1[i];
            boolean check = false;
            for (int j = 0, length2 = nums2.length; j < length2; j++) {
                if ( num == nums2[j] ) {
                    check = true;
                }
                if ( check && nums2[j] > num ) {
                    num = nums2[j];
                    break;
                }
            }
            if ( num != nums1[i] ) {
                result[i] = num;
            }
            else {
                result[i] = -1;
            }
        }

        return result;
    }
}
