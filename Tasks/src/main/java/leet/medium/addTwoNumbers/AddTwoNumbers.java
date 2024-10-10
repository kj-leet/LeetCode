package leet.medium.addTwoNumbers;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <br>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <br>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode res = new ListNode(0);
        ListNode tail = res;
        int carry = 0;
        while(l1!=null || l2!=null ||carry!=0)
        {
            int d1 = (l1 == null) ? 0 : l1.val;
            int d2 = (l2 == null) ? 0 : l2.val;
            int sum = d1 + d2 + carry;
            int r = sum%10;
            carry = sum/10;
            tail.next = new ListNode(r);
            tail = tail.next;
            l1 = (l1==null) ? null : l1.next;
            l2 = (l2==null) ? null : l2.next;
        }
        ListNode result = res.next;
        res.next = null;
        return result;
    }
}



