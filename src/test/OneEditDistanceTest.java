package test;

import main.OneEditDistance;
import org.junit.Assert;
import org.junit.Test;

class OneEditDistanceTest {
    @Test
    public void testIsOneEditDistance(){
       OneEditDistance distance = new OneEditDistance();
        Assert.assertEquals(true, distance.isOneEditDistance("a", "b"));
        Assert.assertEquals(true, distance.isOneEditDistance("abcre", "abere"));
        Assert.assertEquals(true, distance.isOneEditDistance("abc", "abdc"));
        Assert.assertEquals(true, distance.isOneEditDistance("abcd", "abc"));
        Assert.assertEquals(false, distance.isOneEditDistance("abcde", "abc"));
    }

    @Test
    public void testIsOneEditDistanceDp(){
        OneEditDistance distance = new OneEditDistance();
        Assert.assertEquals(true, distance.isOneEditDistanceDp("a", "b"));
        Assert.assertEquals(true, distance.isOneEditDistanceDp("abcre", "abere"));
        Assert.assertEquals(true, distance.isOneEditDistanceDp("abc", "abdc"));
        Assert.assertEquals(true, distance.isOneEditDistanceDp("abcd", "abc"));
        Assert.assertEquals(false, distance.isOneEditDistanceDp("abcde", "abc"));
    }

    @Test
    public void testEditDistance() {
        OneEditDistance distance = new OneEditDistance();
        Assert.assertEquals(0, distance.editDistance("a", "a"));
        Assert.assertEquals(2, distance.editDistance("a", "bc"));
        Assert.assertEquals(3, distance.editDistance("kitten", "sitting"));
    }
}
