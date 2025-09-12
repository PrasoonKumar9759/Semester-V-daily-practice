class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int[] a:points){
            pq.add(a);
        }
        int[] fpair=pq.poll();
        int start=fpair[0];
        int ans=0;
        while(!pq.isEmpty()){
            int[] pair=pq.poll();
            if(pair[0]-start>w){
                ans++;
                start=pair[0];
            }
        }
        return ans+1;
    }
}