package wei.leetcode.learn.contest.contest178;

import org.assertj.core.util.Streams;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LinkedListInBinaryTreeTest {

    @InjectMocks
    private LinkedListInBinaryTree linkedListInBinaryTree;

    static Stream<Arguments> getSource() {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        TreeNode treeNode4 = new TreeNode(2);
        treeNode2.right = treeNode4;

        TreeNode treeNode5 = new TreeNode(1);
        treeNode4.left = treeNode5;

        TreeNode treeNode6 = new TreeNode(2);
        treeNode3.left = treeNode6;

        TreeNode treeNode7 = new TreeNode(6);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode6.left = treeNode7;
        treeNode6.right = treeNode8;

        TreeNode treeNode9 = new TreeNode(1);
        TreeNode treeNode10 = new TreeNode(3);
        treeNode8.left = treeNode9;
        treeNode8.right = treeNode10;
        return Stream.of(
                Arguments.of(node1, treeNode1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void isSubPath(ListNode head, TreeNode root, boolean check) {
        boolean result = linkedListInBinaryTree.isSubPath(head, root);

        assertThat(result).isEqualTo(check);
    }
}