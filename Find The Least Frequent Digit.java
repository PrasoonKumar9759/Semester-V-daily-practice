class Solution {
    public int getLeastFrequentDigit(int n) {
        StringBuilder sb=new StringBuilder();
        sb.append(n);
        int[] freq=new int[10];
        for(int i=0;i<sb.length();i++){
            freq[sb.charAt(i)-'0']++;
        }
        int minfreq=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=9;i>=0;i--){
            if(freq[i]>0 && freq[i]<=minfreq){
                ans=i;
                minfreq=freq[i];
            }
        }
        // System.out.print(Arrays.toString(freq));
        return ans;
    }
}