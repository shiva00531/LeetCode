class Solution {
    public ListNode oddEvenList(ListNode head) {
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
        tempB.next = null;
        a = a.next;
        b = b.next;
        tempA.next = b;
        return a;
    }
}