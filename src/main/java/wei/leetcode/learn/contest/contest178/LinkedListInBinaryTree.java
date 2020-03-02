package wei.leetcode.learn.contest.contest178;

import org.springframework.stereotype.Component;

/**
 * LinkedListInBinaryTree.
 * TODO
 * <p>
 * 2020/3/1
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if ( head.val == root.val ) {
            if ( head.next == null ) {
                return true;
            }
            else {
                head = head.next;
            }
        }
        if ( root.right != null && root.left != null ) {
            return isSubPath(head, root.left) || isSubPath(head, root.right);
        }
        else if ( root.right == null && root.left != null) {
            return isSubPath(head, root.left);
        }
        else if ( root.left == null && root.right != null) {
            return isSubPath(head, root.right);
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}