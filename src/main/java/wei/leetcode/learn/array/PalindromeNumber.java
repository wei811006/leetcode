package wei.leetcode.learn.array;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if ( x < 0 || (x % 10 == 0 && x != 0) ) return false;

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber*10 + x%10;
            x = x/10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }

}
