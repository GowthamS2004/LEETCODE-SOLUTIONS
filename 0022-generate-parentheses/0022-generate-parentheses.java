class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String s = "";
        solve(n, res, s, 0, 0);
        return res;
    }

    public void solve(int n, List<String> res, String s, int open_count, int close_count) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
      
        if (open_count <n) {
            solve(n, res, s + "(", open_count+1, close_count);
        }
        if ( close_count<open_count) {
            solve(n, res, s + ")", open_count, close_count+1);
        }
      

    }
}