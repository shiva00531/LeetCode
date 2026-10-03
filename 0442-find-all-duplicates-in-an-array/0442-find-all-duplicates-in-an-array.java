class Solution {
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    public List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i < n){
            if(arr[i] == i+1 || arr[i] == arr[arr[i]-1]) i++;
            else{
                swap(i, arr[i]-1, arr);
            }
        }
        List<Integer> ans = new ArrayList<>();
        
        for(i = 0; i<n; i++){
            if(arr[i]!=i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}