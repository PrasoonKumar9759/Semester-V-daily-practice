class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int n=nums.length;
       for(int i=0;i<n;i++){
        if((nums[i]&1)==1){
            nums[i]=1;
        }else nums[i]=0;
       }
       
       HashMap<Integer,Integer> map=new HashMap<>();
       int c=0;
       int total=0;
       for(int i=0;i<n;i++){
        total+=nums[i];
        if(total==k){
            c++;
        }
        if(map.containsKey(total-k)){
            c+=map.get(total-k);
        }
        map.put(total,map.getOrDefault(total,0)+1);
       }
       return c;
        
    }
}