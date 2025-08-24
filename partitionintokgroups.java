class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length%k!=0) return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int groups=nums.length/k;
        for(int i:map.values()){
            if(i>groups){
                return false;
            }
        }
        return true;
    }
}