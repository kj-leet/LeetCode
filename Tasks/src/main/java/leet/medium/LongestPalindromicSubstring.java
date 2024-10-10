package leet.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, return the longest palindromic substring in s.
 * <br>
 * Example 1:
 * <br>
 * Input: s = "babad"
 * <br>
 * Output: "bab"
 * <br>
 * Explanation: "aba" is also a valid answer.
 * <br>
 * HINT: MANACHER's ALGORITHM
 */
public class LongestPalindromicSubstring {
    public String longestPalindromicSubstring(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxSubStr = s.substring(0, 1);
        s = "#" + s.replaceAll("", "#") + "#";
        int[] d = new int[s.length()];
        int center = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < right) {
                d[i] = Math.min(right - i, d[2 * center - i]);
            }

            while (i - d[i] - 1 >= 0 && i + d[i] + 1 < s.length() && s.charAt(i - d[i] - 1) == s.charAt(i + d[i] + 1)) {
                d[i]++;
            }

            if (i + d[i] > right) {
                center = i;
                right = i + d[i];
            }

            if (d[i] > maxLen) {
                maxLen = d[i];
                maxSubStr = s.substring(i - d[i], i + d[i] + 1).replaceAll("#", "");
            }
        }

        return maxSubStr;
    }
}
