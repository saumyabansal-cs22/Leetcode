class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Calculate the length of the list
        int len = size(head);
        if (len == 0) {
            return head;
        }

        // Compute the effective number of rotations needed
        k = k % len;
        if (k == 0) {
            return head;
        }

        // Find the new tail: (len - k - 1)th node
        // and the new head: (len - k)th node
        ListNode temp = getnode(head,len-1);
        ListNode newTail = getnode(head,len-k-1);

        ListNode newHead = newTail.next;
        newTail.next = null;

        // Find the end of the rotated part and connect it to the old head
        // while (temp.next != null) {
        //     temp = temp.next;
        // }
        temp.next = head;

        return newHead;
    }

    public int size(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    public ListNode getnode(ListNode head,int k){
        ListNode temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
}
