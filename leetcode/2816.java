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
    public ListNode doubleIt(ListNode head) {
       if (head.val >= 5) {
            head = new ListNode(0, head);
       }

       ListNode node = head;

       while (node != null) {
            node.val = (2 * node.val) % 10;
            if (node.next != null && node.next.val >= 5) {
                node.val++;
            }
            node = node.next;
       }

       return head;
    }
}