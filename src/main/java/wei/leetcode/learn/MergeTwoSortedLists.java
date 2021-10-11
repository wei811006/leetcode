package wei.leetcode.learn;

import org.springframework.stereotype.Component;

@Component
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode start = result;
        while ( true ) {
            if ( l1 == null) {
                start.next = l2;
                break;
            }
            if ( l2 == null) {
                start.next = l1;
                break;
            }
            if ( l1.val >= l2.val ) {
                start.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                start.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            start = start.next;
        }

        return result.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}