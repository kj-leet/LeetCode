package leet.easy;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void twoSum()
    {
        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum(new int[]{2,7,11,15}, 9);
        assertArrayEquals(new int[]{0,1}, res);
    }
}
