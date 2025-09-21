class Solution {
    public long maxTotalValue(int[] nums, int k) {
     int min=nums[0];
     int max=nums[0];
     for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        min=Math.min(min,nums[i]);
     }   
     return (long)(max-min)*k;
    }
}