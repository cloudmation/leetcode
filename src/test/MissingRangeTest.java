package test;

import main.MissingRange;
import org.junit.Assert;
import org.junit.Test;

public class MissingRangeTest {

    @Test
    public void testMissingRange() {
       MissingRange range = new MissingRange();
       Assert.assertArrayEquals(new String[]{"2","4->49","51->74","76->99"}, range.getMissingRange(new Integer[]{0, 1, 3, 50, 75}, 0, 99).toArray());
    }

    @Test
    public void testEmptyString() {
        MissingRange range = new MissingRange();
        Assert.assertArrayEquals(new String[]{"0->99"}, range.getMissingRange(new Integer[]{}, 0, 99).toArray());
    }
}
