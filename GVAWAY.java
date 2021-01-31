package CodeShef;

import java.util.Scanner;

public class GVAWAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if (a==b){
                System.out.println(1);
            }else {
                System.out.println(c);
            }
//            System.out.println(c);
        }
    }
}
