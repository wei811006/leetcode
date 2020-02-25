package wei.leetcode.learn.stack;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * 1047 Remove All Adjacent Duplicates In String.
 *
 * Given a string S of lowercase letters,
 * a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
 *
 * We repeatedly make duplicate removals on S until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made.
 * It is guaranteed the answer is unique.
 * <p>
 * 2020/2/25
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for( char c: S.toCharArray() ) {
            if ( !stack.isEmpty() && stack.peek() == c ) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        stack.stream().forEach(v -> sb.append(v));
        String result = sb.toString();
        if ( result.length() == S.length() ) {
            return result;
        }
        else {
            return removeDuplicates(result);
        }
    }
}
