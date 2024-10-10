package leet.medium;

import leet.medium.addTwoNumbers.AddTwoNumbers;
import leet.medium.addTwoNumbers.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = (new ListNode(2,new ListNode(4, new ListNode(3))));
        ListNode l2 = (new ListNode(5,new ListNode(6, new ListNode(4))));
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        this.assertListNode(List.of(7,0,8), result);
    }

    private void assertListNode(List<Integer> integers, ListNode res)
    {
        List<Integer> result = new ArrayList<>();
        while (res!=null)
        {
            result.add(res.val);
            res = res.next;
        }
        assertEquals(integers.size(), result.size());
        for (int i = 0; i < integers.size(); i++)
        {
            assertEquals(integers.get(i), result.get(i));
        }
    }
}