class Solution {
    public boolean isPowerOfFour(int n) {
        int count=0,run=0,c0=0;
        while(n>0){
            int rem=n%4;
            if(rem==1){
                count++;
            }else if(rem==0) c0++;
            run++;
            n/=4;
        }
        if(count==1 && run-1==c0){
            return true;
        }return false;

    }
}