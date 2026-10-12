/**
 in decimal, it is like 1s,10s,100s,1000s from right(each place is 10 times the place to its right)

 AND

 in binary, it is like 1,2,4,8,18 from right(start from 11 from right thrn keep doubling)
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        ListNode temp = head;
        while(temp!=null){
            ans = ans*2 + temp.val;
            temp = temp.next;
        }
        return ans;
    }
}