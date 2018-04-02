package test;

import main.UniquePaths;
import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {
    @Test
    public void testPath() {
        UniquePaths path = new UniquePaths();
        Assert.assertEquals(2, path.uniquePaths(2,2));
    }
}
