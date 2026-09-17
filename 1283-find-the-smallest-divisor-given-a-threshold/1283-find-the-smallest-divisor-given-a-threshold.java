class Solution {
    public static int calculateSum(int[] arr, int divisor){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += (int)Math.ceil((double)arr[i]/divisor);
        }
        return sum;
    }
    public int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
        //find maximum element
        for(int i = 0; i<n; i++){
            if(arr[i] > high){
                high = arr[i];
            }
        }
        int ans = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            int sum = calculateSum(arr, mid);
            if(sum <= threshold){
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