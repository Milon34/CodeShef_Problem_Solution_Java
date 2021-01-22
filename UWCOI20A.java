package CodeShef;

import java.util.Scanner;

public class UWCOI20A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a=sc.nextInt();
            int max=0;
            for (int i=0;i<a;i++){
                int b=sc.nextInt();
                max=Math.max(max,b);
            }
            System.out.println(max);
        }
    }
}
