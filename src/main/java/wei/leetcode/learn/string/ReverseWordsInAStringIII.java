package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 557 ReverseWordsInAStringIII.
 *
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 2020/2/3 1:52 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        Queue<Character> stack = new LinkedList<>();
        String result = "";

        for ( char c: s.toCharArray() ) {
            if ( ' ' == c ) {
                String tmp = "";
                while( !stack.isEmpty() ) {
                    tmp = stack.poll() + tmp;
                }
                result += tmp + ' ';
                continue;
            }
            stack.offer(c);
        }
        String tmp = "";
        while( !stack.isEmpty() ) {
            tmp = stack.poll() + tmp;
        }
        result += tmp;
        return result;
    }

}
