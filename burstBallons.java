class Solution {
    public int maxCoins(int[] nums) {
        int[] a=new int[nums.length+2];

        a[0]=a[a.length-1]=1;
        for(int i=0;i<nums.length;i++){
            a[i+1]=nums[i];
        }
        int[][] dp=new int [a.length+1][a.length+1];
        for(int[] al:dp){
        Arrays.fill(al,-1);
        }
        return Burst(a,0,a.length-1,dp);
    }
    public int Burst(int[] a,int i,int j,int[][] dp){
        if (i + 1 == j) {
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
		int ans = Integer.MIN_VALUE;
		for (int k = i + 1; k < j; k++) {
			int left = Burst(a, i, k,dp);
			int right = Burst(a, k, j,dp);
			int self = a[i] * a[j] * a[k];
			ans = Math.max(ans, left + right + self);
		}
		return dp[i][j] =ans;

    }
}