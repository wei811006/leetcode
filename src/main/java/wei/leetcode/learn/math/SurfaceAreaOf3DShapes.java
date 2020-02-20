package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

/**
 * 892 Surface Area of 3D Shapes.
 * <p>
 * On a N * N grid, we place some 1 * 1 * 1 cubes.
 * <p>
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
 * <p>
 * Return the total surface area of the resulting shapes.
 * <p>
 * 2020/02/2020/2/20
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class SurfaceAreaOf3DShapes {
    public int surfaceArea(int[][] grid) {
        int result = 0, length = grid.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int num = grid[i][j];
                if (num > 0) {
                    result += num * 4 + 2;
                }
                if (i > 0) {
                    result -= Math.min(num, grid[i - 1][j]) * 2;
                }
                if (j > 0) {
                    result -= Math.min(num, grid[i][j - 1]) * 2;
                }
            }
        }

        return result;
    }
}
