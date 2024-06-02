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
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode temp=head;
         ListNode prev= null;
         while(temp!=null){
            ListNode kth_node=getnode(temp,k-1);
            if (kth_node==null){
                if (prev!=null){
                    prev.next=temp;
                }
                break;
            }
            ListNode nn=kth_node.next;
            kth_node.next=null;
            ListNode newh=reverse(temp);
            if (temp==head){
                head=kth_node;
            }
            else{
                prev.next=newh;
            }
            prev=temp;
            temp=nn;

         }
         return head;
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode nn= temp.next;
            temp.next=prev;
            prev=temp;
            temp=nn;
        }
        return prev;
    }
    public ListNode getnode(ListNode head,int k){
        ListNode temp=head;
        for(int i=0;i<k;i++){
            if (temp==null){
                return null;
            }
            temp=temp.next;
        }
        return temp;
    }
}