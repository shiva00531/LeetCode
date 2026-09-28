class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        long ans = 0;
        while(left <= right){
            if(left == right){
                ans += nums[left];
            }
            else{
                String s = "" + nums[left] + nums[right];
                ans += Long.parseLong(s);
            }
            left++;
            right--;
        }
        return ans;
    }
}