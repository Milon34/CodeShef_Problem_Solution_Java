package CodeShef;

import java.util.Scanner;

public class FLOW007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int s=sc.nextInt();
            int value=0;
            while (s!=0){
               int digit=s%10;
               value=value*10+digit;
                s/=10;

            }
            System.out.print(value);
        }
    }
}