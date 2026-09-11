class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        int count = 0;
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        Arrays.sort(arr);
        if(n==0) return 0;
        for(int i = 0; i<n; i++){
            if(arr[i]-1==lastSmaller){
                count++;
                lastSmaller = arr[i];
            }
            else if(arr[i]!=lastSmaller){
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}