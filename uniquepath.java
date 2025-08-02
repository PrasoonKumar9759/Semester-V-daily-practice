class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return call(dp,0,0,m-1,n-1);
    }
    public int call(int[][] dp,int cr,int cc,int er,int ec){
        if(cr==er && cc== ec){
            return 1;
        }
        if(cr>er || cc>ec){
            return 0;
        }
        if(dp[cr][cc]!=-1) return dp[cr][cc];
        int a=call(dp,cr+1,cc,er,ec);
        int b=call(dp,cr,cc+1,er,ec);
        dp[cr][cc]=a+b;
        return a+b;
    }
}