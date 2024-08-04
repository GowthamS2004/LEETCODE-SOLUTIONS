class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
   {
    
    
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,result,list,target,0);
        return result;
    }

    public void solve(int[] candidates,List<List<Integer>>result,List<Integer>list,int target,int i)
    {
        if(target==0 )
        {
            result.add(new ArrayList<>(list));return;
        }
        if(target<0 || i>=candidates.length)
        {
          return;
        }
        else{
            list.add(candidates[i]);
             solve(candidates,result,list,target-candidates[i],i+1);
             list.remove(list.size()-1);
             int j;
             for( j=i;j<=candidates.length-1;j++)
             {
                if(candidates[i]!=candidates[j]){break;}
             }
             if(j==i)
             {
            solve(candidates,result,list,target,i+1);
             }
             else
             {
                solve(candidates,result,list,target,j);
             }
             }
        }
    }
