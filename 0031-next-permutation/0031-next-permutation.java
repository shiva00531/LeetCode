class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int idx = -1;
        //find the breakpoint
        for(int i = n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                idx = i;
                break;
            }
        }
        //if no breakpoint, reverse entire array
        if(idx == -1){
            int start = 0; 
            int end = n-1;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return;
        }
        //find larger element that just slightly greater than that arr[idx]
        for(int i = n-1; i>idx; i--){
            if(arr[i] > arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }
        //reverse the part after index
        int left = idx+1;
        int right = n-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        } 
    }
}