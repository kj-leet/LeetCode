package leet.medium;

import java.util.HashMap;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * <br>
 * Input: s = "abcabcbb"
 * <br>
 * Output: 3
 * <br>
 * Explanation: The answer is "abc", with the length of 3.
 * <br>
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s)
    {
        int left = 0;
        int maxlength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right<s.length(); right ++)
        {
            if (!map.containsKey(s.charAt(right)) || map.get(s.charAt(right)) < left)
            {
                map.put(s.charAt(right), right);
                maxlength = Math.max(maxlength, right - left + 1);
            }
            else
            {
                left = map.get(s.charAt(right)) + 1;
                map.put(s.charAt(right), right);
            }
        }
        return maxlength;
    }
}
