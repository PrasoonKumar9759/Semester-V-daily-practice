class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        boolean[] pl=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!pl[j] && fruits[i]<=baskets[j]){
                    pl[j]=true;
                    break;
                }
            }
        }
        int no=0;
        for(boolean a: pl){
            if(!a) no++;
        }
    return no;
    }
}