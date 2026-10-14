class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(100);
        dummy.next = head;
        ListNode tempA = dummy;
        ListNode tempB = head;
        while(tempB!=null){
            if(tempB.next!=null && tempB.val == tempB.next.val){
                int val = tempB.val;
                while(tempB != null && tempB.val==val){
                    tempB = tempB.next;
                }
                tempA.next = tempB;
            }
            else{
                tempA = tempB;
                tempB = tempB.next;
            }
        }
        return dummy.next;
    }
}