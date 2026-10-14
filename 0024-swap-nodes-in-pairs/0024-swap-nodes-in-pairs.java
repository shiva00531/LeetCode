class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);
        ListNode tempA = a;
        ListNode tempB = b;
        ListNode temp = head;
        int pos = 1;
        while(temp!=null){
            if(pos%2!=0){
                tempA.next = temp;
                temp = temp.next;
                tempA = tempA.next;
            }
            else{
                tempB.next = temp;
                temp = temp.next;
                tempB = tempB.next;
            }
            pos++;
        }
        tempA.next = null;
        tempB.next = null;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode odd = a.next;
        ListNode even = b.next;
        while(odd!=null && even!=null){
            t.next = even;
            even = even.next;
            t = t.next;

            t.next = odd;
            odd = odd.next;
            t = t.next;
        }
        return dummy.next;
    }
}