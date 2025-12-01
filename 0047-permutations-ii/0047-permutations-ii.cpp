class Solution {
public:
    vector<vector<int>> result;

    void backtrack(vector<int>& nums, int start) {

        if (start == nums.size()) {
            result.push_back(nums);
            return;
        }

        unordered_set<int> used;  // to avoid duplicate swaps at same level

        for (int i = start; i < nums.size(); i++) {

            // Skip if we already used this number at this depth
            if (used.count(nums[i])) 
                continue;

            used.insert(nums[i]);

            swap(nums[start], nums[i]);
            backtrack(nums, start + 1);
            swap(nums[start], nums[i]);
        }
    }

    vector<vector<int>> permuteUnique(vector<int>& nums) {
        sort(nums.begin(), nums.end());  // sorting helps grouping duplicates
        backtrack(nums, 0);
        return result;
    }
};
