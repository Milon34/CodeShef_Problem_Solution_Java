package CodeShef;

import java.util.Scanner;

public class TWONMS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long a,b,n;
            a=sc.nextLong();
            b=sc.nextLong();
            n=sc.nextLong();
            if (n%2!=0){
                a*=2;
                long x=Math.max(a,b)/Math.min(a,b);
                System.out.println(x);
            }else {
                System.out.println(Math.max(a,b)/Math.min(a,b));
            }
//            long c=a,d=b,count=0;
//                for (int i = 1; i <= n; i += 2) {
//                    c *= 2;
//                    count++;
//                }
//            for (int i=1;i<=Math.abs(n-count);i++){
//                d=2*b;
//            }
//            long ts,td;
//            ts=Math.max(c,d);
//            td=Math.min(c,d);
//            System.out.println(ts/td);

        }
    }
}
