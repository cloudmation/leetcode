package test;

import main.DivideIntegers;
import org.junit.Assert;
import org.junit.Test;

public class DivideIntegersTest {

    @Test
    public void testDivideBigNumber(){
       DivideIntegers divide = new DivideIntegers();
       Assert.assertEquals(Integer.MAX_VALUE, divide.divide(Integer.MAX_VALUE, 1));
       Assert.assertEquals(Integer.MIN_VALUE, divide.divide(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testDivideNormal(){
        DivideIntegers divide = new DivideIntegers();
        Assert.assertEquals(5, divide.divide(10, 2));
        Assert.assertEquals(4, divide.divide(9, 2));
    }
}
