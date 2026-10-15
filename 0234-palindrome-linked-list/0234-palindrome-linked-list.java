class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow;
        ListNode prev = null;
        ListNode n = slow;
        while(cur!=null){
            n = cur.next;
            cur.next = prev;
            prev = cur;
            cur = n;
        }
        ListNode tempA = head;
        ListNode tempB = prev;
        while(tempB!=null){
            if(tempA.val!=tempB.val) return false;
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return true;
    }
}