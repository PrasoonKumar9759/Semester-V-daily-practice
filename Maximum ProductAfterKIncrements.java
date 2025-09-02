class Solution {
    
    public int maximumProduct(int[] nums, int k) {
         int MOD = 1_000_000_007;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums) pq.add(i);
        while(k>0){
           pq.add((pq.poll()+1));
           k--;
        }
        long score=1;
        while(!pq.isEmpty()){
            score=(score*pq.poll())%MOD;
        }
        
        return (int)score;
    
    }
}