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
        int size = findLength(head);
        int k= size-n;
        ListNode prev=head;
        if (k==0){
            return head.next;
        }
        for(int i=0;i<k-1;i++){
            prev=prev.next;
        }
        ListNode nn= prev.next;
        prev.next=nn.next;
        nn.next=null;
        return head;
    }
    public int findLength(ListNode head){
        int count = 0;
        if(head == null) return count;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    
}