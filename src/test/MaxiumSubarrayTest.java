package test;

import main.MaxiumSubarray;
import org.junit.Assert;
import org.junit.Test;

public class MaxiumSubarrayTest {
    @Test
    public void testMaxSubarray() {
        MaxiumSubarray max = new MaxiumSubarray();
        int sum = max.maxSubArray(new int[] {2, 1, -3, 4, -1, 2, 1, -5, 4});
        Assert.assertEquals(6, sum);
    }

}
