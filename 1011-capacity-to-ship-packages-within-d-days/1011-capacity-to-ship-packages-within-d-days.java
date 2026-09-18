class Solution {
    public static int calculateDays(int[] arr, int capacity){
        int n = arr.length;
        int days = 1;
        int currentWeight = 0;
        for(int i = 0; i<n; i++){
            if(currentWeight + arr[i] <= capacity){
                currentWeight+=arr[i];
            }
            else{
                days++;
                currentWeight = arr[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        //find maximum element for low
        int low = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > low){
                low = arr[i];
            }
        }
        //find summ of array for high
        int high = 0;
        for(int i = 0; i<n; i++){
            high+=arr[i];
        }
        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;

            int daysRequired = calculateDays(arr, mid);

            if(daysRequired <= days){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}