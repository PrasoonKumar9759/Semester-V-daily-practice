class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr=new int[1000];
        for(int i=0;i<trips.length;i++){
            int j=trips[i][1];
            while(j<trips[i][2]){
                arr[j]+=trips[i][0];
                j++;
            }
        }
        for(int i=0;i<1000;i++){
            if(arr[i]>capacity){
                return false;
            }
        }
        return true;
    }
}