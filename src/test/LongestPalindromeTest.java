package test;

import main.LongestPalindrome;
import org.junit.Assert;
import org.junit.Test;

class LongestPalindromeTest {
    @Test
    public void testPalindrome() {
       LongestPalindrome longest = new LongestPalindrome();
        Assert.assertEquals("bab", longest.longestPalindrome("babad"));
        Assert.assertEquals("bb", longest.longestPalindrome("cbbd"));
    }

    @Test
    public void testPalindromeDp() {
       LongestPalindrome longest = new LongestPalindrome();
        Assert.assertEquals("bab", longest.LongestPalindromeDp("babad"));
        Assert.assertEquals("bb", longest.LongestPalindromeDp("cbbd"));
    }
}
