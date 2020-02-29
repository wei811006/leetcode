package wei.leetcode.learn.stack;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * 20 Valid Parentheses.
 * <p>
 * Given a string containing just the
 * characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * 2020/2/29
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if ( stack.isEmpty() || stack.pop() != '(' )
                        return false;
                    break;
                case '}':
                    if ( stack.isEmpty() || stack.pop() != '{' )
                        return false;
                    break;
                case ']':
                    if ( stack.isEmpty() || stack.pop() != '[' )
                        return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}
