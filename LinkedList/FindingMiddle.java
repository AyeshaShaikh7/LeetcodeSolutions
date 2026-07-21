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
class Solution {                                //using slow and fast pointer
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){ //it goes on till fast is at last
            fast = fast.next.next;
            slow = slow.next;
        }
       return slow; //when fast will be at last, slow would be at the middle, because fast movse at twice the speed of slow
    }
}
