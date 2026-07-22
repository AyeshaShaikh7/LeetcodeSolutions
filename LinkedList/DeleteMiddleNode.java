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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) { //finding the middle of node
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;

        }
        if(prev == null){
            return null;
        }
       prev.next = slow.next; //skipping the middle node
       return head;
    }
}
