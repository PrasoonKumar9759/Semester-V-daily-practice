class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(intervals[0][0]);
        int last=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=last){
                last=Math.max(last,intervals[i][1]);
            }else{
                ar.add(last);
                ar.add(intervals[i][0]);
                last=intervals[i][1];
            }
        }
        ar.add(last);
        System.out.println(ar);
        int len=ar.size();
        int[][] res=new int[len/2][2];
        for(int i=0;i<len/2;i++){
            res[i][0]=ar.get(i*2);
            res[i][1]=ar.get(2*i+1);
        }
    return res;
    }
}