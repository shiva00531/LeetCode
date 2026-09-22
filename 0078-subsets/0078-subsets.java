class Solution {
    public void findSubsets(int i, int[] arr, ArrayList<Integer> ans, List<List<Integer>> result){
        if(i==arr.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        //take
        ans.add(arr[i]);
        findSubsets(i+1, arr, ans, result);

        //backtrack
        ans.remove(ans.size()-1);

        //not take
        findSubsets(i+1, arr, ans, result);
    }
    public List<List<Integer>> subsets(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(0, arr, ans, result);
        return result;
    }
}
