package wei.leetcode.learn.stack;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * 1021 Remove Outermost Parentheses.
 *
 * A valid parentheses string is either
 * empty (""), "(" + A + ")", or A + B,
 * where A and B are valid parentheses strings,
 * and + represents string concatenation.
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 *
 * A valid parentheses string S is primitive if it is nonempty,
 * and there does not exist a way to split it into S = A+B,
 * with A and B nonempty valid parentheses strings.
 *
 * Given a valid parentheses string S,
 * consider its primitive decomposition: S = P_1 + P_2 + ... + P_k,
 * where P_i are primitive valid parentheses strings.
 *
 * Return S after removing the outermost parentheses of
 * every primitive string in the primitive decomposition of S.
 * <p>
 * 2020/2/24
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder();
        int flag = 0;
        for(Character c: S.toCharArray()) {
            if ( c  == '(' ) {
                flag++;
                if ( flag != 1) {
                    result.append(c);
                }
            }
            else {
                flag--;
                if ( flag != 0 ) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
