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
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        
        if(head == null){
            return false;
        }
        ListNode k = head;
        ListNode h = head;
        
        while(h !=null && h.next!=null){
            k= k.next;
            h = h.next.next;
            
            if(k == h){
                return true;
            }
        }
        return false; 
    }
    
}