package test;

import main.LongestSubstringWithKDistinct;
import org.junit.Assert;
import org.junit.Test;

class LongestSubstringWithKDistinctTest {
    @Test
    public void testOne() {
        LongestSubstringWithKDistinct longest = new LongestSubstringWithKDistinct();
        Assert.assertEquals( 3, longest.lengthOfLogest("eceba"));
    }

    @Test
    public void testTwo() {
        LongestSubstringWithKDistinct longest = new LongestSubstringWithKDistinct();
        Assert.assertEquals( 5, longest.lengthOfLogest("eecebaaaa"));
    }
}
