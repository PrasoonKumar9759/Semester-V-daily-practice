class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int c=0;
        int total=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            c+=nums[i];
            if(c==goal){
                total++;
            }if(map.containsKey(c-goal)){
                total+=map.get(c-goal);
            }
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return total;
    }
}