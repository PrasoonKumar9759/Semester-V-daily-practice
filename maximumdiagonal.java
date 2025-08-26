class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int ans=0;
        double max=0;
        int n=d.length;
        for(int i=0;i<n;i++){
            int l=d[i][0];
            int b=d[i][1];
            double f=Math.sqrt((l*l)+(b*b));
            if(f>max){
                max=f;
                ans=l*b;
            }
            if(f==max){
                ans=Math.max(ans,l*b);
            }
        }
        return ans;
    }
}