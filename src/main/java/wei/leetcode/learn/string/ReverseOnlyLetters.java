package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

/**
 * 917 ReverseOnlyLetters.
 * <p>
 * Given a string S, return the "reversed" string
 * where all characters that are not a letter stay in the same place,
 * and all letters reverse their positions.
 * <p>
 * 2020/2/6 5:31 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int a = 0, b = S.length()-1;

        while (a < b) {
            while ( !Character.isLetter(chars[a]) ) {
                a++;
            }
            while ( !Character.isLetter(chars[b]) ) {
                b--;
            }
            swap(chars, a++, b--);
        }

        return String.valueOf(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
