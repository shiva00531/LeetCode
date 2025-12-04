class Solution {
public:
    ListNode* head;
    Solution(ListNode* head) {
        this->head = head;
        srand(time(NULL));
    }
    
    int getRandom() {
        int res = 0, i = 1;
        ListNode* cur = head;
        while (cur) {
            if (rand() % i == 0) res = cur->val;
            cur = cur->next;
            i++;
        }
        return res;
    }
};
