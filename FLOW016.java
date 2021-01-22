package CodeShef;

import java.util.Scanner;

public class FLOW016 {
//    public static long GCDCalculate(long num1, long num2) {
//        long gcd = 1;
//        for (int i = 1; i <= num1 && i <= num2; i++) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                gcd = i;
//
//            }
//        }
//       return gcd;
//    }
//
//    public static long LCMCalculate(long num1, long num2) {
//        long gcd = 1;
//        for (int i = 1; i <= num1 && i <= num2; i++) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                gcd = i;
//
//            }
//        }
//        long lcm = (num1 * num2) / gcd;
//        return lcm;
//    }
   public static long gcdAlgorithm(long n1, long n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdAlgorithm(n2, n1 % n2);
    }
    public static long lcm(long number1, long number2) {
        if (number1 == 0 || number2 == 0)
            return 0;
        else {
            long gcd = gcdAlgorithm(number1, number2);
            return Math.abs(number1 * number2) / gcd;
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long a,b;
            a=sc.nextLong();
            b=sc.nextLong();
            System.out.print(gcdAlgorithm(a,b)+" ");
            System.out.println(lcm(a,b));
        }
    }
}
