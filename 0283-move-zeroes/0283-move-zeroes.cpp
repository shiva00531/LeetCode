class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int idx = 0;
        for (int x : nums) {
            if (x != 0) nums[idx++] = x;
        }
        while (idx < nums.size()) nums[idx++] = 0;
    }
};
