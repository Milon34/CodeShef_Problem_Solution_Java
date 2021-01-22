package CodeShef;

import java.util.Scanner;

public class PPSUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a,b,sum=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for (int i=1;i<=a;i++){
                sum=0;
                for (int j=1;j<=b;j++) {
                   sum+=j;
                }
                b=sum;
            }
            System.out.println(sum);
        }
    }
}
