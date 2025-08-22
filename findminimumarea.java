class Solution {
    public int minimumArea(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int mini=m, maxi=0, minj=n, maxj=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    mini=Math.min(mini,i);
                    maxi=Math.max(maxi,i);
                    minj=Math.min(minj,j);
                    maxj=Math.max(maxj,j);
                }
            }
        }
        return (maxi-mini+1)*(maxj-minj+1);
    }
}