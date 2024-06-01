// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode reverseBetween(ListNode head, int l, int r) {
        // Special case where no reversal is needed
        if (l == r) {
            return head;
        }
        
        // Create a dummy node to handle edge cases easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        
        // Move `pre` to the node just before the start of the sublist to be reversed
        for (int i = 1; i < l; i++) {
            pre = pre.next;
        }
        
        // `start` will point to the beginning of the sublist to be reversed
        ListNode start = pre.next;
        // `then` will point to the node that will be reversed
        ListNode then = start.next;
        
        // Reverse the sublist from `l` to `r`
        for (int i = 0; i < r - l; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        
        return dummy.next;
    }
}
