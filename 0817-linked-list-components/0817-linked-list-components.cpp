class Solution {
public:
    int numComponents(ListNode* head, vector<int>& nums) {
        unordered_set<int> s(nums.begin(), nums.end());
        int count = 0;
        while (head) {
            if (s.count(head->val) && (!head->next || !s.count(head->next->val)))
                count++;
            head = head->next;
        }
        return count;
    }
};
