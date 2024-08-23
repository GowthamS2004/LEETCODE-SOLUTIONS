class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return  Math.min(solve(cost,dp,0),solve(cost,dp,1));
        
    }
    public int solve(int[]cost,int[]dp,int i)
    {
        if(i>=cost.length)
        {
            return 0;
        }
        if(dp[i]!=-1){return dp[i];}
        int onestep=cost[i]+solve(cost,dp,i+1);
        int twostep=cost[i]+solve(cost,dp,i+2);
        dp[i]=Math.min(onestep,twostep);
        return dp[i];
    }
}