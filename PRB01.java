package CodeShef;

import java.util.Scanner;

public class PRB01 {
    public static boolean isPrime(int value) {
        boolean isPrime = true;
        if (value <= 1) {
            isPrime = false;
            return isPrime;
        } else {
            for (int i = 2; i <= Math.sqrt(value); i++) {
                if ((value % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            if (isPrime(n)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
