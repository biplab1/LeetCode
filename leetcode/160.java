/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int lenA = 0;
        int lenB = 0;

        while (tempA != null) {
            lenA += 1;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB += 1;
            tempB = tempB.next;
        }

        int extra = Math.abs(lenA - lenB);

        if (lenB <= lenA) {
            while (headA != null && extra-- != 0)
                headA = headA.next;
        } else {
            while (headB != null && extra-- != 0)
                headB = headB.next;
        }

        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}



/*
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int lenA = 0;
        int lenB = 0;

        while (tempA != null) {
            lenA += 1;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB += 1;
            tempB = tempB.next;
        }

        int extra = Math.abs(lenA - lenB);

        if (lenB <= lenA) {
            while (headA != null && extra != 0) {
                extra--;
                headA = headA.next;
            }
        } else {
            while (headB != null && extra != 0) {
                extra--;
                headB = headB.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}

*/