package leet.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void findMedianOfTwoSortedArrays() {
        assertEquals(2.50, new MedianOfTwoSortedArrays().findMedianOfTwoSortedArrays(new int[]{1,2}, new int[]{3,4}), 0);
        assertEquals(2.00, new MedianOfTwoSortedArrays().findMedianOfTwoSortedArrays(new int[]{1,3}, new int[]{2}), 0);
    }
}