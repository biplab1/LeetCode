/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        ListNode forward = null;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        curr = prev.next;
        forward = curr;

        for (int i = 0; i < right - left; i++) {
            forward = curr.next;
            curr.next = forward.next;
            forward.next = prev.next;
            prev.next = forward;
        }

        return dummy.next;
    }
}