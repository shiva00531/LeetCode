class Solution {

    public boolean possible(int[] arr, int day, int m, int k) {

        int cnt = 0;
        int noOfB = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] <= day) {
                cnt++;

                if(cnt == k) {
                    noOfB++;
                    cnt = 0;

                    if(noOfB == m) {
                        return true;
                    }
                }
            }
            else {
                cnt = 0;
            }
        }

        return false;
    }


    public int minDays(int[] arr, int m, int k) {

        int n = arr.length;

        // Not enough flowers
        if((long)m * k > n) {
            return -1;
        }

        int low = arr[0];
        int high = arr[0];

        // Find minimum and maximum bloom day
        for(int i = 1; i < n; i++) {

            if(arr[i] < low) {
                low = arr[i];
            }

            if(arr[i] > high) {
                high = arr[i];
            }
        }

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(possible(arr, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}