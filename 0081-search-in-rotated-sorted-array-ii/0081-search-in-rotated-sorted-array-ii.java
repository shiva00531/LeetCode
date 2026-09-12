class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low = low+1;
                high = high-1;
                continue;
            }
            //the left side is sorted
            if(arr[low]<=arr[mid]){
                if(target>=arr[low] && target<=arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target>=arr[mid] && target<=arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}