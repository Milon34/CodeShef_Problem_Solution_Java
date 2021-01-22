package CodeShef;

import java.util.Scanner;

public class TWOVSTEN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int count=0;
            for (int i=0;i<2;i++){
                if (n%10==0){
                    System.out.println(count);
                    break;
                }else {
                    count++;
                    n*=2;
                    if (n%10==0){
                        System.out.println(count);
                        break;
                    }else {
                        System.out.println("-1");
                        break;
                    }
                }
            }
        }
    }
}
