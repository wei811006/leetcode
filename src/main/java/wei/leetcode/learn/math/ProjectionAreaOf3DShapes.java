package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

/**
 * 883 Projection Area of 3D Shapes.
 * <p>
 * On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.
 * <p>
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
 * <p>
 * Now we view the projection of these cubes onto the xy, yz, and zx planes.
 * <p>
 * A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane.
 * <p>
 * Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.
 * <p>
 * Return the total area of all three projections.
 * <p>
 * 2020/02/2020/2/15
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class ProjectionAreaOf3DShapes {

    public int projectionArea(int[][] grid) {
        int result = 0;
        int maxI = grid.length, maxJ = grid[0].length;
        for (int i = 0; i < maxI; i++) {
            int maxRow = 0, maxCol = 0;
            for (int j = 0; j < maxJ; j++) {
                int num = grid[i][j];
                if (num != 0) result++;
                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            result += maxRow;
            result += maxCol;
        }

        return result;
    }

}
