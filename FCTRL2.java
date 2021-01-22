package CodeShef;

import java.util.Scanner;

public class FCTRL2 {
    public  static long factorial(long n){
        if (n==1||n==2){
            return n;
        }else {
            return n*factorial(n-1);
        }
    }
    public  static  int getSum(int n){
        int sum=0;
        while (n!=0){
            sum = sum + n % 10;
            n = n/10;
        }
        return  sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
           int n=sc.nextInt();
            System.out.println(getSum(n));
            System.out.println(factorial(n));
        }
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n=sc.nextInt();
            long val=1;
            for (long i=n;i>=1;i--){
                val*=i;
            }
            System.out.println(val);
        }
    }
}