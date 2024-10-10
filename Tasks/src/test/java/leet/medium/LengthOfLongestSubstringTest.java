package leet.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubstringTest {

    @Test
    public void lengthOfLongestSubstringTest()
    {
        assertEquals(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(new LengthOfLongestSubstring().lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(new LengthOfLongestSubstring().lengthOfLongestSubstring("pwwkew"), 3);
    }
}