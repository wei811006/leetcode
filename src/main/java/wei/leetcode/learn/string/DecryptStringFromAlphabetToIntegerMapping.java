package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

/**
 * 1309 DecryptStringFromAlphabetToIntegerMapping.
 * <p>
 * Given a string s formed by digits ('0' - '9') and '#'.
 * We want to map s to English lowercase characters as follows:
 * <p>
 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 * Return the string formed after mapping.
 * <p>
 * It's guaranteed that a unique mapping will always exist.
 * <p>
 * 2020/2/2 1:25 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class DecryptStringFromAlphabetToIntegerMapping {

    /**
     * @param s source
     * @return answer
     */
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {
                sb.append(to(s.substring(i, i + 2)));
                i = i + 3;
            } else {
                sb.append(to(s.substring(i, i + 1)));
                i++;
            }
        }

        return sb.toString();
    }

    private char to(String str) {
        return (char) (96 + Integer.parseInt(str));
    }

}
