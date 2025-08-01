class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
        int[][] dp=new int[m][n];

        if(obstacleGrid[0][0]==1){
            return 0;
        }
        

        //setting up default values
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=-1;
                }else{
                    dp[i][j]=0;
                    
                }
            }
        }

        //using dp
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0 && dp[i][j]!=-1){
                    dp[i][j]=1;
                    continue;
                }
                if(dp[i][j]!=-1){
                    if(i==0){
                        dp[i][j]=dp[i][j-1];
                        continue;
                    }else if(j==0){
                        dp[i][j]=dp[i-1][j];
                        continue;
                    }
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }else{
                    dp[i][j]=0;
                }
            }
        }

        return dp[m-1][n-1];


    }
}