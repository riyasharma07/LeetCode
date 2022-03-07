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
    public ListNode reverse(ListNode head){
        ListNode prev= null;
        ListNode curr= head;
        while(curr!= null){
            ListNode next= curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
            
        }
        return prev;
    }
    
    public ListNode fM(ListNode head){
        ListNode h=head;
        ListNode  t= head;
        while(h.next !=null && h.next.next != null){
            h=h.next.next;
            t=t.next;
        }
        return t;
        
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode m = fM(head);
        ListNode sechalf= reverse(m.next);
        ListNode fh= head;
        while(sechalf != null){
            if(fh.val != sechalf.val){
                return false;
                
            }
            fh=fh.next;
            sechalf=sechalf.next;
        }
        return true;
    }
}