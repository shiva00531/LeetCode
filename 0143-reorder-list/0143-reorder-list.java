class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        //find middle
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode cur = slow.next;
        ListNode n = cur;
        slow.next = null;
        while(cur!=null){
            n = cur.next;
            cur.next = prev;
            prev = cur;
            cur = n;
        }
        ListNode tempA = head;
        ListNode tempB = prev;
        while(tempB!=null){
            ListNode a = tempA.next;
            ListNode b = tempB.next;
            
            tempA.next = tempB;
            tempB.next = a;
            tempA = a;
            tempB = b;

        }
        
    }
}