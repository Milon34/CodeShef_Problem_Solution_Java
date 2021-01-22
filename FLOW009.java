package CodeShef;

import java.util.Scanner;

public class FLOW009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a,b;
            double n,d;
            a=sc.nextInt();
            b=sc.nextInt();
            n= a*b;
            d= ((0.1)*n);
            if (a<1000){
                System.out.printf("%f\n",n);
            }else {
                System.out.printf("%f\n",(n-d));
            }
        }
    }
}
