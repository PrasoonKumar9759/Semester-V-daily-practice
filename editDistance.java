class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        return helper(word1,word2,0,0,dp);

    }
    public int helper(String s1,String s2,int i,int j,int[][] dp){
        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()) return s1.length()-i;
        if(dp[i][j]!=0) return dp[i][j];
        int ans=Integer.MAX_VALUE;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=helper(s1,s2,i+1,j+1,dp);
        }else{
            int D =helper(s1, s2, i + 1, j,dp);
			int R = helper(s1, s2, i + 1, j + 1,dp);
			int I = helper(s1, s2, i, j + 1,dp);
			ans = Math.min(D, Math.min(R, I)) + 1;
        }
        return dp[i][j]=ans;
    }
}