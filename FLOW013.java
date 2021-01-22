package CodeShef;

import java.util.Scanner;

public class FLOW013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            int value=a+b+c;
            if (value==180){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
