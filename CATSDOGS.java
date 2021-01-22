package CodeShef;

import java.util.Scanner;

public class CATSDOGS {
    public  static boolean check(long c,long d,long l){
        if (l%4!=0){
            return  false;
        }
        long m=0;
        if (2*d>=c){
            m=d*4;
        }else {
            m=4*(c-d);
        }
        long ms=4*(c+d);
        if (m<=l&&l<=ms){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long c,d,l;
            c=sc.nextLong();
            d=sc.nextLong();
            l=sc.nextLong();
        if(check(c,d,l)){
            System.out.println("yes");
        }else {
            System.out.println("no");
          }
        }
    }
}
