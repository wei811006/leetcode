package wei.leetcode.learn.stack;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * 844 Backspace String Compare.
 * <p>
 * Given two strings S and T,
 * return if they are equal when both are typed into empty text editors.
 * # means a backspace character.
 * <p>
 * 2020/2/26
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    private String build(String s) {
        Stack<Character> stack = new Stack<>();
        for ( char c: s.toCharArray() ) {
            if ( '#' != c  ) {
                stack.push(c);
            }
            else if ( !stack.isEmpty() ) {
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}
