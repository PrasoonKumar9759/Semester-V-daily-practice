class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i:nums){
            if(i>=0){
                pos.add(i);
            }else{
                neg.add(i);
            }
        }
        int i=0;
        while(i<n){
            nums[i]=pos.get(i/2);
            nums[i+1]=neg.get((i)/2);
            i+=2;;
        }
        return nums;

    }
}