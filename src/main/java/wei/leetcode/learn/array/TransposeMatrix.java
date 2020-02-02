package wei.leetcode.learn.array;

import org.springframework.stereotype.Component;

/**
 * 867 TransposeMatrix.
 * Given a matrix A, return the transpose of A.
 * The transpose of a matrix is the matrix flipped over it's main diagonal,
 * switching the row and column indices of the matrix.
 * <p>
 * 2020/2/1 1:28 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class TransposeMatrix {

    public int[][] transpose(int[][] A) {

        int[][] result = new int[A[0].length][A.length];
        for ( int i = 0; i < A.length; i++ ) {
            for ( int j = 0; j < A[i].length; j++ ) {
                result[j][i] = A[i][j];
            }
        }

        return result;
    }

}
