class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(min>nums[i]) min=nums[i];
        }
        return sum-nums.length*min;

    }
}