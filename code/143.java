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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        // split into two halves
        // use fast and slow pointers, 
        // need the address of node previous to middle node
        // to set its next pointer to null, marks end of first half
        // reverse the second half
        // merge the first half with the reversed second half
        
        ListNode endL1 = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            endL1 = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        endL1.next = null;

        ListNode L1 = head;
        ListNode L2 = reverse(slow);

        merge(L1, L2);
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, forward = null;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    void merge(ListNode t1, ListNode t2) {
        while (t1 != null) {
            ListNode n1 = t1.next, n2 = t2.next;
            t1.next = t2;

            if (n1 == null) break;
            
            t2.next = n1;
            t1 = n1;
            t2 = n2;
        }
    }
}