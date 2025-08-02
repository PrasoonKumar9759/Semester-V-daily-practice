class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        
        int m=grid.length,n=grid[0].length;
        if(m==1 && n==1 && grid[0][0]==1) return 0;
        int[][] dp =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return call(dp,grid,0,0,m-1,n-1);
    }
    public int call(int[][] dp,int[][]grid,int cr,int cc,int er,int ec){
        if(cr==er && cc==ec){
            return 1;
        }if(cr>er || cc>ec || grid[cr][cc]==1){
            return 0;
        }
        int a=0,b=0;
        if(dp[cr][cc]!=-1) return dp[cr][cc];
        if(cr+1<=er &&grid[cr+1][cc]!=1){
            a=call(dp,grid,cr+1,cc,er,ec);
        }
        if(cc+1<=ec && grid[cr][cc+1]!=1){
            b= call(dp,grid,cr,cc+1,er,ec);
        }
        dp[cr][cc]=a+b;
        return a+b;
    }
}