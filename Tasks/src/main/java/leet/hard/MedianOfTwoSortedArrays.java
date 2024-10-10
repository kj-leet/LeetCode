package leet.hard;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <br>
 * The overall run time complexity should be O(log (m+n)).
 * <br>
 * Example 1:
 * <br>
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianOfTwoSortedArrays(int[] nums1, int[] nums2)
    {
        int m = nums1.length;
        int n = nums2.length;
        int m1 =0;
        int m2 = 0;
        int i = 0;
        int j = 0;
        for (int c = 0 ; c <= (m+n)/2; c ++)
        {
            m2 = m1;
            if (i!=n && j!=m)
            {
              if (nums1[i] > nums2[j])
              {
                  m1 = nums2[j++];
              }
              else
              {
                  m1 = nums1[i++];
              }
            }
            else if (i<n)
            {
                m1 = nums1[i++];
            }
            else
            {
                m1 = nums2[j++];
            }
        }
        if ((n+m)%2 ==1)
        {
            return (double) m1;
        }
        else
        {
            return ((double) m1 + (double) m2 )/ 2.0;
        }
    }
}
