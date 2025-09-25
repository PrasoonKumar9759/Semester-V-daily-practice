// package contesdiv32509;

import java.util.HashSet;
import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(call(arr,k));
        }
    }
    public static int call(int[] arr,int k){
        int c=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr) set.add(i);
        for(int i=0;i<k;i++){
            if(!set.contains(i)) c++;
        }
        int freq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                freq++;
            }
        }
        return Math.max(c,freq);
    }
}