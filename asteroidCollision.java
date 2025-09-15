class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer> st=new Stack<>();
      for(int i:asteroids){
        if(i>0){
            st.push(i);
        }else{
            while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(i)){
                st.pop();
            }
            if(!st.isEmpty() && st.peek() == Math.abs(i)){
                st.pop();
            }
            else if(st.isEmpty() || st.peek()<0){
                st.push(i);
            }
        }
      }
      int i=st.size()-1;
      int[] ans=new int[st.size()];
      while(i>=0){
        ans[i]=st.pop();
        i--;
      }
      return ans;
      
    }
}