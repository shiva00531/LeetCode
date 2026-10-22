class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        // check k nodes are available
        for(int i = 0; i<k; i++){
            if(temp==null) return head;
            temp = temp.next;
        }
        //reverse k nodes
        ListNode prev = null;
        ListNode cur = head;
        ListNode n = null;

        for(int i = 0; i<k; i++){
            n = cur.next;
            cur.next = prev;
            prev = cur;
            cur = n;
        }
        // connect the remaining groups
        head.next = reverseKGroup(cur, k);
        return prev;
    }
}