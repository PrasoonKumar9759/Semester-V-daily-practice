

import java.util.Arrays;
import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] money = new int[n];
            int[] disc = new int[k];
            for (int i = 0; i < n; i++) {
                money[i] = sc.nextInt();
            }
            for (int j = 0; j < k; j++) {
                disc[j] = sc.nextInt();
            }
            System.out.println(call(money, disc));
        }
    
    }

    public static long call(int[] money, int[] disc) {
        Arrays.sort(money);
        reverse(money); // now descending

        Arrays.sort(disc);

        long total = 0;
        for (int price : money) total += price;

        int left = 0;
        for (int x : disc) {
            if (left + x - 1 >= money.length) break;
            total -= money[left + x - 1];
            left += x;
        }
        return total;
    }

    private static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }
}
