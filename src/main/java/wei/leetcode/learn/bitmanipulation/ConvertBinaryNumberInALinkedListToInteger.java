package wei.leetcode.learn.bitmanipulation;

import org.springframework.stereotype.Component;

/**
 * 1290. Convert Binary Number in a Linked List to Integer.
 *
 * Given head which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number.
 *
 * Return the decimal value of the number in the linked list.
 * <p>
 * 2020/6/2
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ConvertBinaryNumberInALinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        String binary = "";
        while (head.next != null) {
            binary += head.val;
            head = head.next;
        }
        binary += head.val;

        return Integer.valueOf(binary, 2);
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}