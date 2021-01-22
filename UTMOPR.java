package CodeShef;

import java.util.Scanner;

public class UTMOPR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int sum=0;
            for (int i=0;i<n;i++){
                int a;
                a=sc.nextInt();
                sum+=a;
            }
            if (k==1) {
                if (sum % 2 == 0) {
                    System.out.println("odd");
                }else {
                    System.out.println("even");
                }
            }else {
                System.out.println("even");
            }
        }
    }
}
