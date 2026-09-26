class Solution {
    public void print(int start, int close, int n, String s, ArrayList<String> ans){
        if(s.length() == 2*n){
            ans.add(s);
            return;
        }
        if(start < n) print(start+1, close, n, s+"(", ans);
        if(close < start) print(start, close+1, n, s+")", ans);
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        print(0, 0, n, "", ans);
        return ans;
    }
}