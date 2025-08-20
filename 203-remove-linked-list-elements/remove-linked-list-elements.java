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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ll= head;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(ll!=null){
            // ListNode temp=ll.next;
            if (ll.val==val){
                prev.next=ll.next;
            }
            else{
                prev=ll;
            }
            ll=ll.next;
        }
        return dummy.next;
    }
}