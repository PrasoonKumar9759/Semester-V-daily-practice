class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] a=new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=nums[i];
        }
        int[] b=new int[n-1];
        for(int i=1;i<n;i++){
            b[i-1]=nums[i];
        }
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int[] dp1=new int[n];
        Arrays.fill(dp1,-1);
        int fs=helper(a,0,n-1,dp);
        int ss=helper(b,0,n-1,dp1);
        return Math.max(fs,ss);

    }
    public int helper(int[] a,int i,int j,int[] d){
        if(i>=j) return 0;
    if(d[i]!=-1) return d[i];
        int inc=a[i]+helper(a,i+2,j,d);
        int exc=helper(a,i+1,j,d);
        return d[i]=Math.max(inc,exc);
    }
}