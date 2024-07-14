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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(list);

        curr= head;

        for (int i : list) {
            curr.val = i;
            curr = curr.next;
        }

        return head;
    }
}
