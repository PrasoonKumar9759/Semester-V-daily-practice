import java.util.Scanner;

public class capacity116A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[2*n];
        for(int i=0;i<2*n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0,capc=0;
        for(int i=0;i<2*n;i+=2){
            capc-=arr[i];
            capc+=arr[i+1];
            max=Math.max(capc,max);
        }
        System.out.println(max);
    }
}