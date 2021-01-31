package CodeShef;

import java.util.Scanner;

public class SUBINC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            long dp[]=new long[(int)n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                dp[i]=1;
            }
            //int count = n;
//            for (long i:dp){
//                System.out.println(i);
//            }
            for (int i = 1; i < n; i++) {
                if (arr[i]>arr[i-1]){
                    dp[i]+=dp[i-1];
                }
            }
            for (long i:dp){
                System.out.println(i);
            }
            long ans=0;
            for (int i=0;i<n;i++){
                ans+=dp[i];
            }
            System.out.println(ans);
        }
    }
}
