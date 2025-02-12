/*
Method 1.0:
Intuition: create a new list by merging the two lists by comparing each node value
TC: O(N)
SC: O(N)
 */
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var dummy = ListNode()

        var curr = dummy
        var l1 = list1
        var l2 = list2

        while (l1 != null && l2 != null) {
            if (l1.`val` <= l2.`val`) {
                curr.next = l1
                l1 = l1.next
            } else {
                curr.next = l2
                l2 = l2.next
            }

            curr = curr.next!!
        }

        if (l1 != null) {
            curr.next = l1
        }

        if (l2 != null) {
            curr.next = l2
        }

        return dummy.next
    }
}
