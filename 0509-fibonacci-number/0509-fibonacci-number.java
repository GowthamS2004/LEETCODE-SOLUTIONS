class Solution {
    public int fib(int n) {
        
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
       
        return fib_dp(n,dp);
    }
    public int fib_dp(int n,int[]dp)
    {
        if(n==0 || n==1)
        {
            dp[n]= n;
            return dp[n];
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        else
        {
            dp[n]=fib_dp(n-2,dp)+fib_dp(n-1,dp);
            return dp[n];
        }
    }
}