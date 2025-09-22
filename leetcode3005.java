class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int m=0;
        for(int i:map.keySet()){
            m=Math.max(m,map.get(i));
        }
        int ans=0;
        for(int i:map.keySet()){
            if(m==map.get(i)){
                ans+=map.get(i);
            }
        }
        return ans;
    }
}