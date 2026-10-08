public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head==null || head.next==null) return null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(fast!=slow) return null;
        ListNode t = head;

        while(t!=slow){
            t = t.next;
            slow = slow.next;
        }
        return slow;
    }
}