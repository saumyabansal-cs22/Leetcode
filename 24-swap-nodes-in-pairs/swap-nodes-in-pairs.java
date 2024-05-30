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
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode curr=head.next.next;
        ListNode temp= head;
        head=head.next;
        head.next=temp;
        while(curr!=null && curr.next!=null){
            temp.next=curr.next;
            temp=curr;
            ListNode nn= curr.next.next;
            curr.next.next=curr;
            curr=nn;
        }
        temp.next=curr;
        return head;


    }
}