package CodeShef;

import java.util.Scanner;

public class TRISQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int x=n-2;
            x/=2;
            int res=(x*(x+1))/2;
            System.out.println(res);
        }
    }
}
