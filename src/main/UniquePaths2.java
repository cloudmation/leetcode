package main;

import java.util.Arrays;

public class
UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[] map = new int[col];
        map[0] = 1;
        for (int[] anObstacleGrid : obstacleGrid) {
            for (int j = 0; j < col; j++) {
                if (anObstacleGrid[j] == 1) {
                    map[j] = 0;
                } else if (j > 0) {
                    map[j] += map[j - 1];
                }
            }
        }
        return map[col - 1];
    }
}
