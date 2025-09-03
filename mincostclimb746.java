 class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        dp[0]=Math.min(cost[0],cost[1]);
        if(n==2) return dp[0];
        // dp[1]=Math.min(cost[1],cost[2]);
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        System.out.print(dp[1]);
        return Math.min(dp[n-1],dp[n-2]);

    }
}