class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums.length,l1,l2,0,nums);
        return l1;
    }
    public void solve(int n,List<List<Integer>>l1,List<Integer>l2,int i,int[]nums)
    {
        if(n==i)
        {
            
              l1.add(new ArrayList<>(l2));
            
        }
        else{
            l2.add(nums[i]);
            solve(n,l1,l2,i+1,nums);
            l2.remove(l2.size()-1);
            int j;
            for(j=i;j<=n-1;j++)
            {
                if(nums[i]!=nums[j])
                {
                    break;
                }
            }
            if(j==i)
            {
                 solve(n,l1,l2,i+1,nums);
            }
            else
            {
                 solve(n,l1,l2,j,nums);
            }
        }
    }
}