class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
        String ans = "";
        int i = 0;
        int j = 0;
        while(j < s.length()){
            if(s.charAt(j)==s.charAt(i)){
                j++;
            }
            else{
                int len = j-i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }
        int len = j-i;
        ans += len;
        ans += s.charAt(i);
        return ans;
    }
}