class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long consec=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans+=consec+1;
                consec++;
            }else{
                consec=0;
            }
        }
        return ans;
    }
}