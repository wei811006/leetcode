package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

/**
 * 824 GoatLatin.
 *
 * A sentence S is given, composed of words separated by spaces.
 * Each word consists of lowercase and uppercase letters only.
 *
 * We would like to convert the sentence to "Goat Latin"
 * (a made-up language similar to Pig Latin.)
 *
 * The rules of Goat Latin are as follows:
 *
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 * For example, the word 'apple' becomes 'applema'.
 *
 * If a word begins with a consonant (i.e. not a vowel),
 * remove the first letter and append it to the end, then add "ma".
 * For example, the word "goat" becomes "oatgma".
 *
 * Add one letter 'a' to the end of each word per its word index in the sentence,
 * starting with 1.
 * For example, the first word gets "a" added to the end,
 * the second word gets "aa" added to the end and so on.
 * Return the final sentence representing the conversion from S to Goat Latin.
 *
 * 2020/2/5 9:41 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class GoatLatin {

    public String toGoatLatin(String S) {
        StringBuilder result = new StringBuilder();
        StringBuilder end = new StringBuilder("maa");
        for( String str: S.split(" ") ) {
            char firstChar = str.charAt(0);
            if (isVowel(firstChar)) {
                result.append(str);
            }
            else {
                result.append(str.substring(1) + firstChar);
            }
            result.append(end + " ");
            end.append("a");
        }

        return result.substring(0, result.length() - 1);
    }

    private boolean isVowel(char c) {
        if ( c == 'a' || c == 'A'
                || c == 'e' || c == 'E'
                || c == 'i' || c == 'I'
                || c == 'o' || c == 'O'
                || c == 'u' || c == 'U'
        ) {
            return true;
        }
        return false;
    }
}
