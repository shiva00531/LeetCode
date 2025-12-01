class Solution {
public:
    vector<vector<int>> result;
    
    void backtrack(vector<int>& nums, int start) {

        // If we reached the end, store the permutation
        if (start == nums.size()) {
            result.push_back(nums);
            return;
        }

        // Swap current index with all possible next indices
        for (int i = start; i < nums.size(); i++) {
            swap(nums[start], nums[i]);          // choose
            backtrack(nums, start + 1);          // explore
            swap(nums[start], nums[i]);          // undo (backtrack)
        }
    }

    vector<vector<int>> permute(vector<int>& nums) {
        backtrack(nums, 0);
        return result;
    }
};
