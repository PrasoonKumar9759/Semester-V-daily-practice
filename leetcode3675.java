class Solution {
    public int minOperations(String s) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put((int)ch,map.getOrDefault((int)ch,0)+1);
        }
        int ans=0;
        for(int i: map.keySet()){
            int max=(26-(i-97))%26;
            ans=Math.max(ans,max);
        }
        System.out.println(map);
        return ans;

    }
}