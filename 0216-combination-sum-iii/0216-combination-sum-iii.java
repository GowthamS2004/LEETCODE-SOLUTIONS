class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        solve(res,li,1,n,k);
        return res;
    }
    public void solve( List<List<Integer>> res,List<Integer> li,int i,int n,int k)
    {
        if(li.size()==k)
        {
            if(n==0)
            {
               res.add(new ArrayList<>(li));
            }
            return;
        }
        if(i==10)
        {
            return;
        }
        else
        {
            li.add(i);
            solve(res,li,i+1,n-i,k);
            li.remove(li.size()-1);
            solve(res,li,i+1,n,k);
        }
    }
}