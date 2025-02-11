/*
Method 1.0:
Intuition: Use three pointers curr, prev, forward. Move forward to node next to curr, update curr
node address to prev, move prev to curr and move curr to forward. Repeat until
curr reaches the end and prev points to the head of the new reversed linkedlist.
TC: O(N)
SC: O(1)
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
    fun reverseList(head: ListNode?): ListNode? {
        var curr = head
        var prev: ListNode? = null
        var forward = head

        while (curr != null) {
            forward = curr.next
            curr.next = prev
            prev = curr
            curr = forward
        }

        return prev
    }
}
