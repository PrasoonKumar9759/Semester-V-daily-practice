class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (mp.containsKey(arr[i])) 
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } 
            else
            {
                mp.put(arr[i], 1);
        }

        }
        // System.out.print(mp);
        // return new int[0];
        int[][] pair=new int[mp.size()][2];
        int j=0;
      for(int i:mp.keySet()){
        pair[j][0]=i;
        pair[j][1]=mp.get(i);
        j++;
      }
    int[] ans=new int[k];
    Arrays.sort(pair,(a,b)->b[1]-a[1]);
        for(int i=0;i<k;i++){
            ans[i]=pair[i][0];
      }
      return ans;

    }
}