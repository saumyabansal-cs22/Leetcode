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
    public ListNode mergeNodes(ListNode head) {
        ListNode ll= head.next;
        ListNode prev = new ListNode(0);
        ListNode dummy=prev;
        while(ll!=null){
            int sum=0;
            while(ll.val!=0){
                sum=sum+ll.val;
                ll=ll.next;
            }
            ListNode nn= new ListNode(sum);
            dummy.next=nn;
            dummy=nn;
            ll=ll.next;
        }   
        return prev.next;
    }
}