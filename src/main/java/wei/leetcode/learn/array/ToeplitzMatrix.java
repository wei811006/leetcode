package wei.leetcode.learn.array;

import org.springframework.stereotype.Component;

/**
 * 766 ToeplitzMatrix.
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 * <p>
 * 2020/2/1 1:49 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0, max = matrix.length - 1; i < max; i++) {
            for ( int j = 0, maxJ = matrix[i].length - 1; j < maxJ; j++ ) {
                if ( matrix[i][j] != matrix[i+1][j+1] ) {
                    return false;
                }
            }
        }
        return true;
    }

}
