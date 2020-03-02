package wei.leetcode.learn.sort;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 1030 Matrix Cells in Distance Order.
 * <p>
 * We are given a matrix with R rows and C columns has cells with
 * integer coordinates (r, c), where 0 <= r < R and 0 <= c < C.
 * <p>
 * Additionally, we are given a cell in that matrix with coordinates (r0, c0).
 * <p>
 * Return the coordinates of all cells in the matrix,
 * sorted by their distance from (r0, c0) from smallest distance to largest distance.
 * Here, the distance between two cells (r1, c1) and (r2, c2) is
 * the Manhattan distance, |r1 - r2| + |c1 - c2|.
 * (You may return the answer in any order that satisfies this condition.)
 * <p>
 * 2020/3/2
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class MatrixCellsInDistanceOrder {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                list.add(new int[]{i, j});
            }
        }

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return calcDis(o1) - calcDis(o2);
            }

            private int calcDis(int[] a) {
                return Math.abs(a[0] - r0) + Math.abs(a[1] - c0);
            }
        });

        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}
