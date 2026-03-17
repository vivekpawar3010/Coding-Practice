
// 83. Remove Duplicates from Sorted List
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

// Example 1:

// Input: head = [1,1,2]
// Output: [1,2]
// Example 2:

// Input: head = [1,1,2,3,3]
// Output: [1,2,3]

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                ListNode temp = curr.next;
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}

public class MAR_17_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = sol.deleteDuplicates(head);
}
