/*
Method 1.0:
Intuition: use slow and fast pointers, if there is a cycle then they will eventually catch-up
TC: O(N)
TC: O(1)
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
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow!!.next
            fast = fast!!.next.next

            if (slow == fast) return true
        }

        return false
    }
}
