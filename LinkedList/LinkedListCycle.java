/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {                        //using fast and slow pointers
    public boolean hasCycle(ListNode head) {   // this is an optimal approach
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next; //move fast ahead by 2
            slow = slow.next;      //move slow ahead by 1
            if(fast == slow){ //if they meet, then loop exists
                return true;
            }
        }
      return false;
    }
}
