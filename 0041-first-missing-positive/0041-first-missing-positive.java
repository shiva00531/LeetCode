class Solution {
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i < n){
            if(arr[i] > n || arr[i] == i+1 || arr[i] <= 0 || arr[i] == arr[arr[i]-1]){
                i++;
            }
            else{
                swap(i, arr[i]-1, arr);
            }
        }
        for(i = 0; i<n; i++){
            if(arr[i]!=i+1) return i+1;
        }
        return i+1;
    }
}