package CodeShef;

import java.util.Scanner;

public class DIVTHREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k, d;
            n = sc.nextInt();
            k = sc.nextInt();
            d = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int ans = sum / k;
            if (ans>=d){
                System.out.println(d);
            }else {
                System.out.println(ans);
            }
//            if (sum<k){
//                System.out.println("0");
//            }else {
//                int b = 0;
//                for (int i = 1; i <= d; i++) {
//                   if (k*i<=sum){
//                      b=i;
//                   }else {
//                       break;
//                   }
//                }
//                System.out.println(b);
        }
    }
}

