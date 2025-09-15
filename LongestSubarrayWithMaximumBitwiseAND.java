class Solution {
    public int longestSubarray(int[] nums) {
        int maxa=nums[0];
        for(int i=0;i<nums.length;i++){
            maxa=Math.max(maxa,nums[i]);
        }
        int ans=1;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maxa){
                c++;
                ans=Math.max(ans,c);
            }else{
                c=0;
            }

        }
        return ans;
    }
}