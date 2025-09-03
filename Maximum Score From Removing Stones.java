class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int score=0;
        while(true){
            int f=pq.poll();
            int s=pq.poll();
            if(f==0 || s==0) break;
            pq.add(f-1);
            pq.add(s-1);
            score++;
        }
        return score;
     
    }
}