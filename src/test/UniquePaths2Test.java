package test;

import main.UniquePaths;
import main.UniquePaths2;
import org.junit.Assert;
import org.junit.Test;

public class UniquePaths2Test {
    @Test
    public void testUniquePath(){
        UniquePaths2 path = new UniquePaths2();
        int[][] obstacleGrid = new int[1][2];
        obstacleGrid[0][0] = 1;
        obstacleGrid[0][1] = 0;
        int paths = path.uniquePathsWithObstacles(obstacleGrid);
        Assert.assertEquals(0, paths);
    }

}
