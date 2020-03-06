package wei.leetcode.learn.heap;

import org.springframework.stereotype.Component;

import java.util.PriorityQueue;

/**
 * 378 Kth Smallest Element in a Sorted Matrix.
 * <p>
 * Given a n x n matrix where each of
 * the rows and columns are sorted in ascending order,
 * find the kth smallest element in the matrix.
 * <p>
 * Note that it is the kth smallest element in the sorted order,
 * not the kth distinct element.
 * <p>
 * 2020/3/6
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0, maxI = matrix.length; i < maxI; i++) {
            for (int j = 0, maxJ = matrix[i].length; j < maxJ; j++) {
                queue.add(matrix[i][j]);
            }
        }

        while (k-- > 0) {
            if (k == 0) return queue.poll();
            queue.poll();
        }

        return 0;
    }
}
