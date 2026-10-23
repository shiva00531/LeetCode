class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode n = null;
        while(cur!=null){
            n = cur.next;
            cur.next = prev;
            prev = cur;
            cur = n;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);

        ListNode temp = head;
        int max = temp.val;
        while(temp.next!=null){
            if(temp.next.val < max){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
                max = temp.val;
            }
        }
        return reverse(head);
    }
}