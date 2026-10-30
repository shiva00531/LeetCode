class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;

        // Count nodes
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Store values in array
        int[] arr = new int[n];
        temp = head;

        for (int i = 0; i < n; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }

        // Swap kth node from beginning and end
        int a = k - 1;
        int b = n - k;

        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;

        // Put array values back into linked list
        temp = head;

        for (int i = 0; i < n; i++) {
            temp.val = arr[i];
            temp = temp.next;
        }

        return head;
    }
}