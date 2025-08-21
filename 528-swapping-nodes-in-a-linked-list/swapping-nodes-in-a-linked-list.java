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
    public ListNode swapNodes(ListNode head, int k) {
        int size=size(head);
        ListNode a= head;
        for(int i=1;i<k;i++){
            a=a.next;
        }
        ListNode b= head;
        for(int i=1;i<size-k+1;i++){
            b=b.next;
        }
        int value =a.val;
        a.val=b.val;
        b.val=value;
        return head;
    }
    public int size(ListNode head){
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
}