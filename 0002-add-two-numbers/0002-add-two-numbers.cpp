class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        ListNode* dummy = new ListNode();  // start point
        ListNode* current = dummy;         // pointer to build result list
        
        int carry = 0;
        
        while (l1 != nullptr || l2 != nullptr || carry != 0) {

            int sum = carry;

            if (l1 != nullptr) {
                sum += l1->val;
                l1 = l1->next;
            }

            if (l2 != nullptr) {
                sum += l2->val;
                l2 = l2->next;
            }

            carry = sum / 10;               // calculate carry
            int digit = sum % 10;           // extract digit

            current->next = new ListNode(digit);
            current = current->next;
        }

        return dummy->next;  // skip dummy node
    }
};