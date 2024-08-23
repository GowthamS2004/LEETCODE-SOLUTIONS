class Solution {
    public int tribonacci(int n) {
       int[]dp=new int[n+1];
       Arrays.fill(dp,-1);
       return solve(n,dp);
    }

    public int solve(int n,int[]dp)
    {
        if(n==0)
        {
            dp[0]=0;
            return dp[0];
        }
        if(n==1 || n==2)
        {
            dp[n]=1;
            return dp[n];
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        else
        {
            dp[n]=solve(n-3,dp)+solve(n-2,dp)+solve(n-1,dp);
            return dp[n];
        }
    }
}