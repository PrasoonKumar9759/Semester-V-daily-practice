class Solution {
    public int minFallingPathSum(int[][] m) {
        int r=m.length;
        int[][] dp=new int[r][r];
        for(int[] a:dp){
            Arrays.fill(a,-7777777);
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<r;j++){
            ans=Math.min(ans,call(m,0,j,dp));
        }
        return ans;
    }
    public int call(int[][] m,int i,int j,int dp[][]){
        if(j<0 || j>=m.length ){
            return Integer.MAX_VALUE;
        }
        if(i==m.length-1){
            return m[i][j];
        }
        if(dp[i][j]!=-7777777){
            return dp[i][j];
        }
        int lc=call(m,i+1,j-1,dp);
        int bc=call(m,i+1,j,dp);
        int rc=call(m,i+1,j+1,dp);
        return dp[i][j]=Math.min(lc,Math.min(bc,rc))+m[i][j];
    }
}