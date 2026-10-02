class Solution {
    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i < n){
            if(arr[i] == i+1 || arr[i] == arr[arr[i]-1]){
                i++;
            }
            else{
                swap(i, arr[i]-1, arr);
            }
        }
        for(i = 0; i<n; i++){
            if(arr[i]!=i+1){
                return new int[]{arr[i], i+1};
            }
        }
        return new int[]{-1, 1};
    }
}