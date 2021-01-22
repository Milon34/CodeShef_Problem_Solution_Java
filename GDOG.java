package CodeShef;

import java.util.Scanner;

public class GDOG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            int max=0;
            for (int i=1;i<=b;i++){
                if (a%i>max){
                    max=a%i;
                }
            }
            System.out.println(max);
        }
    }
}
