package test;

import main.ContainsDuplicateIII;
import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateIIITest {
    
    @Test
    public void Test1(){
        ContainsDuplicateIII sol = new ContainsDuplicateIII();
        int[] ints = new int[] {1,2,3,1};
        boolean res = sol.containsNearbyAlmostDuplicate(ints, 3, 0);
        Assert.assertEquals(true, res);
    }
    
}
