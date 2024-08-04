class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(candidates,result,list,target,0);
        return result;
    }

    public void solve(int[] candidates,List<List<Integer>>result,List<Integer>list,int target,int i)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(list));return;
        }
        if(target<0 || i>=candidates.length)
        {
          return;
        }
        else{
            list.add(candidates[i]);
             solve(candidates,result,list,target-candidates[i],i);
             list.remove(list.size()-1);
              solve(candidates,result,list,target,i+1);
        }
    }
}