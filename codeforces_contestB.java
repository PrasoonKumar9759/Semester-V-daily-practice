// package contesdiv32509;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class problemB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(call(arr));
        }
    }
    public static int call(int[] arr){
        Arrays.sort(arr);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length-1;i+=2){
            int m=Math.abs(arr[i]-arr[i+1]);
            pq.add(m);
        }
        return pq.poll();
    }
}