class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;

        // fill  matrix with -1
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = -1;
            }
        }
        ListNode temp = head;
        while(left<=right && top<=bottom && temp!=null ){
            //left to right
            for(int i = left; i<=right && temp!=null; i++){
                arr[top][i] = temp.val;
                temp = temp.next;
            }
            top++;
            //top to bottom
            for(int i = top; i<=bottom && temp!=null; i++){
                arr[i][right] = temp.val;
                temp = temp.next;
            }
            right--;
            //right to left
            for(int i = right; i>=left && temp!=null; i--){
                arr[bottom][i] = temp.val;
                temp = temp.next;
            }
            bottom--;
            //bottom to top
            for(int i = bottom; i>=top && temp!=null; i--){
                arr[i][left] = temp.val;
                temp = temp.next;
            }
            left++;
        }
        return arr;
    }
}