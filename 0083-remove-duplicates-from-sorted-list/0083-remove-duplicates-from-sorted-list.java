class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode tempA = head;
        ListNode tempB = head.next;
        while(tempB!=null){
            if(tempA.val == tempB.val){
                tempB = tempB.next;
                tempA.next = tempA.next.next;
            }
            else{
                tempA = tempA.next;
                tempB = tempB.next;
            }
        }
        return head;
    }
}