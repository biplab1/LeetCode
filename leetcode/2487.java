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
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode forward = head;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        head = prev;

        prev = null;
        curr = head;
        forward = head;

        int maxEle = head.val;

        while (curr != null) {
            if (curr.val < maxEle) {
                curr = curr.next;
            } else if (curr.val >= maxEle) {
                maxEle = curr.val;
                forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
        }

        head = prev;

        return head;
    }
}