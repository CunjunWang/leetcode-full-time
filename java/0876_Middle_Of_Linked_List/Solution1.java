/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    /*
     * Two pointers.
     * 
     * Time Complexity: O(n);
     * Space Complexity: O(1);
     */
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
}