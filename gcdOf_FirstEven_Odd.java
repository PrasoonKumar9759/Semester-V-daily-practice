class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=n*n;
        int sumeven=n*(n+1);
        while(sumeven%sumodd!=0){
            int rem=sumeven%sumodd;
            sumeven=sumodd;
            sumodd=rem;
        }
        return sumodd;
    }
}