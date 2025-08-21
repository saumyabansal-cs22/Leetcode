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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len= getlen(head);
        // if(len==1 && n==1){
        //     return null;
        // }
        if(len==n){
            return head.next;
        }
        int lennode= len-n;
        // ListNode dummy= new ListNode(0);
        // dummy.next=head;
        ListNode prev=new ListNode(0);
        prev.next=head;
        ListNode ll=head;
        int c=0;
        while(ll!=null){
            if(c==lennode){
                prev.next=ll.next;
                ll.next=null;
            }
            else{
                prev=prev.next;
            }
            ll=ll.next;
            c++;
        }
        return head;
    }
    public int getlen(ListNode head){
        int n=0;
        ListNode ll= head;
        while(ll!=null){
            n++;
            ll=ll.next;
        }
        return n;
    }
}