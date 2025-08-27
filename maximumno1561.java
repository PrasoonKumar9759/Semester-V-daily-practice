class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0,n=piles.length-1;
        int ans=0;
        while(i<n){
            n--;
            ans+=piles[n];
            i++;
            n--;
        }
        return ans;
    }
}