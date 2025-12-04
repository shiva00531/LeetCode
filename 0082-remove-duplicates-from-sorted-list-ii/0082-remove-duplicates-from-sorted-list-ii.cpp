class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode dummy(0);
        dummy.next = head;
        ListNode* cur = &dummy;

        while (cur->next && cur->next->next) {
            if (cur->next->val == cur->next->next->val) {
                int val = cur->next->val;
                while (cur->next && cur->next->val == val) 
                    cur->next = cur->next->next;
            } else {
                cur = cur->next;
            }
        }
        return dummy.next;
    }
};
