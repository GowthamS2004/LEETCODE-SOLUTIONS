class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         int n=nums.length;
         Arrays.sort(nums);
         List<List<Integer>>res=new ArrayList<>();
         for(int i=0;i<(1<<n);i++)
         {
            List<Integer> li= new ArrayList<>();
            for(int j=0;j<=n-1;j++)
            {
                if((i&(1<<j))!=0)
                {
                    li.add(nums[j]);
                }
            }
            if(!res.contains(li))
            {
            res.add(li);
            }
         }
         return res;
    }
}