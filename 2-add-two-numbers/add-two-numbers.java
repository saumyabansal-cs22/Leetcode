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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode();
        dummy.val=-1;
        ListNode curr=dummy;
        ListNode a=l1;
        ListNode b=l2;
        int carry=0;
        while(a!=null || b!=null){
            int sum=carry;
            if (a!=null){
                sum=sum+a.val;
                a=a.next;
            }
            if (b!=null){
                sum=sum+b.val;
                b=b.next;
            }
            ListNode nn= new ListNode();
            nn.val=sum%10;
            carry=sum/10;
            curr.next=nn;
            curr=curr.next;
        }
        if(carry!=0){
            ListNode neww= new ListNode();
            neww.val=carry;
            curr.next=neww;
        }
        return dummy.next;
    }
}