class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;
        ListNode a = null, b = null, c = null, d = null;
        ListNode temp = head;
        int pos = 1;
        while(temp!=null){
            if(pos==left-1) a = temp;
            if(pos==left) b = temp;
            if(pos==right) c = temp;
            if(pos==right+1) d = temp;
            temp = temp.next;
            pos++;
        }
        if(a!=null) a.next = null;
        if(c!=null) c.next = null;
        ListNode cur = b;
        ListNode prev = null;
        ListNode n = b;
        while(cur!=null){
            n = cur.next;
            cur.next = prev;
            prev = cur;
            cur = n;
        }
        if(a!=null) a.next = c;
        b.next = d;
        if(a==null) return c;
        return head;
    }
}