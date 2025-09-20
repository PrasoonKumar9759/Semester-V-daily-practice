class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int s=0;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            if(s==sum){
                ans=i;
                break;
            }
            s+=nums[i];
        }
        return ans;
    }
}