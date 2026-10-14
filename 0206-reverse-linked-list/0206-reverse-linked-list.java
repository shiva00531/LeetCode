class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode cur = head;
        ListNode prev = null;
        ListNode n = head;
        while(cur!=null){
            n = cur.next;
            cur.next = prev;
            prev = cur;
            cur = n;
        }
        return prev;
    }
}