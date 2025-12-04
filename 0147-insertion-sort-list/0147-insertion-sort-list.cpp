class Solution {
public:
    ListNode* insertionSortList(ListNode* head) {
        ListNode dummy(INT_MIN);
        ListNode* cur = head;

        while (cur) {
            ListNode* next = cur->next;
            ListNode* p = &dummy;
            while (p->next && p->next->val < cur->val) {
                p = p->next;
            }
            cur->next = p->next;
            p->next = cur;
            cur = next;
        }
        return dummy.next;
    }
};
