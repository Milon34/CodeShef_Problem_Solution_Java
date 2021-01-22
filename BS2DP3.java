package CodeShef;

import java.util.Scanner;

public class BS2DP3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n=sc.nextLong();
            n=n-1;
            long value=1;
            while (n-->0){
                value=value*2;
                value=value%1000000007;
            }
            System.out.println(value);

          //  System.out.println((int) Math.pow(2,(n-1))%1000000007);
        }
    }
}
