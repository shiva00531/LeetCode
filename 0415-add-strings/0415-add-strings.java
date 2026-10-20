class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String ans = "";
        int carry = 0;
        while(i>=0 || j>=0){
            int val1 = 0;
            int val2 = 0;
            if(i>=0) val1 = num1.charAt(i) - '0';
            if(j>=0) val2 = num2.charAt(j) - '0';
            int nums = val1 + val2 + carry;
            ans = (nums%10) + ans;
            if(nums > 9) carry = 1;
            else carry = 0;
            if(i>=0) i--;
            if(j>=0) j--;
        }
        if(carry==1){
            ans = "1" + ans;
        }
        return ans;
    }
}