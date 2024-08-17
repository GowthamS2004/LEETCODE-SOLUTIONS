class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
         
         if(n==1){return nums[0];}

        int[]nums1=new int[n-1];
         int[]nums2=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            nums1[i]=nums[i+1];
        }
         for(int i=0;i<n-1;i++)
        {
            nums2[i]=nums[i];
        }
       
        int []dp1=new int[n];
        Arrays.fill(dp1,-1);
        int[]dp2=new int[n];
        Arrays.fill(dp2,-1);
       return Math.max(solve(nums1,n-1,dp1),solve(nums2,n-1,dp2));
    }
    public int solve(int[]nums,int i,int[]dp)
    {
        if(i==0)
        {
            return 0;
        }
        if(i==1)
        {
            return nums[0];
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        else
        {
           
           int take=nums[i-1]+solve(nums,i-2,dp);
           int not_take=solve(nums,i-1,dp);
           dp[i] =Math.max(take,not_take);
           return dp[i];
        }
    }
}