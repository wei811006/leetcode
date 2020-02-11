package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

/**
 * 463 IslandPerimeter.
 * <p>
 * You are given a map in form of a two-dimensional
 * integer grid where 1 represents land and 0 represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water,
 * and there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes"
 * (water inside that isn't connected to the water around the island).
 * One cell is a square with side length 1.
 * The grid is rectangular, width and height don't exceed 100.
 * Determine the perimeter of the island.
 * <p>
 * 2020/02/2020/2/11
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int result = 0, maxI = grid.length, maxJ = grid[0].length;
        for ( int i = 0; i < maxI; i++ ) {
            for ( int j = 0; j < maxJ; j++ ) {
                if ( grid[i][j] == 1 ) {
                    result += 4;
                    if ( i > 0 && grid[i-1][j] == 1 ) {
                        result -= 2;
                    }
                    if ( j > 0 && grid[i][j-1] == 1 ) {
                        result -= 2;
                    }
                }
            }
        }
        return result;
    }

}
