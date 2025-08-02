class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0,mnr=nums.length-1;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>nums[left]*(long)k) left++;
            mnr = Math.min(mnr, nums.length - (i - left + 1));
        }
        return mnr;
    }
}