package test;

import main.MaximumGap;
import org.junit.Assert;
import org.junit.Test;

public class MaximumGapTest {

    @Test
    public void Test1(){
        MaximumGap sol = new MaximumGap();
        int res = sol.maximumGap(new int[] { 3, 6, 7, 8, 9, 1});
        Assert.assertEquals(3, res);
    }
}
