package test;

import main.RomainToInt;
import org.junit.Assert;
import org.junit.Test;

class RomainToIntTest {
    @Test
    public void testRomain(){
        RomainToInt romain = new RomainToInt();
        Assert.assertEquals(621, romain.romanToInt("DCXXI"));
    }
}
