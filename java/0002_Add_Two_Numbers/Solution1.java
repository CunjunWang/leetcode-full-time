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
     * Iterative solution. Use two pointers
     *
     * Time Complexity: O(N), N = the larger of l1.length and l2.length
     * Space Complexity: O(1), if the result list does not count extra space.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // dummy head
        ListNode head = new ListNode(-1);
        
        ListNode res = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            
            if (l1 != null && l2 != null) {
                sum += l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sum += l1.val + carry;
                l1 = l1.next;
            } else {
                sum += l2.val + carry;
                l2 = l2.next;
            }
            
            carry = sum >= 10 ? 1 : 0;
            sum = sum % 10;
            res.next = new ListNode(sum);
            res = res.next;
        }
        
        if (carry == 1)
            res.next = new ListNode(1);
                
        return head.next;
    }
}