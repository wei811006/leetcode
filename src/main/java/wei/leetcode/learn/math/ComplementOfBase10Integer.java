package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

/**
 * 1009 Complement of Base 10 Integer.
 * <p>
 * Every non-negative integer N has a binary representation.
 * For example, 5 can be represented as "101" in binary,
 * 11 as "1011" in binary, and so on.
 * Note that except for N = 0, there are no leading zeroes in any binary representation.
 * <p>
 * The complement of a binary representation is the number
 * in binary you get when changing every 1 to a 0 and 0 to a 1.
 * For example, the complement of "101" in binary is "010" in binary.
 * <p>
 * For a given number N in base-10,
 * return the complement of it's binary representation as a base-10 integer.
 * <p>
 * 2020/02/2020/2/19
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ComplementOfBase10Integer {

    public int bitwiseComplement(int N) {
        int comparison = 1;

        while ( comparison < N ) {
            comparison = comparison << 1 | 1;
        }

        return N^comparison;
    }

    public static void main(String[] args) {
        int a = 7;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(~a);
        System.out.println(Integer.toBinaryString(~a));
    }
}
