class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode n = cur;
        while(cur!=null){
            n = cur.next;
            cur.next = prev;
            prev = cur;
            cur = n;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while(l1!=null || l2!=null){
            int val1 = 0;
            int val2 = 0;
            if(l1!=null) val1 = l1.val;
            if(l2!=null) val2 = l2.val;
            int num = val1 + val2 + carry;
            ListNode a = new ListNode(num%10);
            temp.next = a;
            temp = temp.next;
            if(num > 9) carry = 1;
            else carry = 0;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry==1){
            ListNode node = new ListNode(1);
            temp.next = node;
            temp = temp.next;
        }
        return reverse(dummy.next);
    }
}