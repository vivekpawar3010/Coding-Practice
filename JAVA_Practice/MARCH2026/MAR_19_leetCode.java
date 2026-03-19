// 234. Palindrome Linked List
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

// Example 1:

// Input: head = [1,2,2,1]
// Output: true
// Example 2:

// Input: head = [1,2]
// Output: false

// Constraints:

// The number of nodes in the list is in the range [1, 105].
// 0 <= Node.val <= 9

class Solution {
    public boolean isPalindrome(ListNode head) {
        String str = "";
        ListNode curr = head;

        // 1. Build the string from the Linked List
        while (curr != null) {
            str = str + curr.val;
            curr = curr.next;
        }

        // 2. Reverse the string
        String rev = new StringBuilder(str).reverse().toString();

        // 3. Compare and return
        return str.equals(rev);
    }
}

public class MAR_19_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean result = sol.isPalindrome(head);
        System.out.println(result); // Output: true
    }
}
