package leet.easy;

import java.util.HashMap;

/// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
/// <br>
/// You may assume that each input would have exactly one solution, and you may not use the same element twice.
/// <br>
/// You can return the answer in any order.
/// <br>
/// Example 1:
/// Input: nums = \[2,7,11,15\], target = 9
/// Output: \[0,1\]
/// Explanation: Because nums\[0\] + nums\[1\] == 9, we return \[0, 1\].
/// <br>
/// Example 2:
/// Input: nums = \[3,2,4\], target = 6
/// Output: \[1,2\]
/// <br>
/// Example 3:
/// Input: nums = \[3,3\], target = 6
/// Output: \[0,1\]
public class TwoSum {
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length; i++)
        {
            if (map.containsKey(target-nums[i]))
            {
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}