class Solution {
    public int longestSubarray(int[] nums) {
        int si=0,n=nums.length;
        int ans=0;
        int countz=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) countz++;

            if(countz<=1) ans=Math.max(ans,i-si);
            
            while(si<=i && countz>1){
                
                if(nums[si]==0){
                    countz--;
                }
                si++;
            }
           
        }
        return ans;
    }
}