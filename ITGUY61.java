package CodeShef;

import java.util.Scanner;

public class ITGUY61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int x = n; x > 0; x--) {
                for (int y=n;y>x;y--) {
                    System.out.print(" ");
                }
                for (int p=0;p<(2*x)-1;p++){
                    System.out.print("1");
                }
                System.out.println();
            }
            for (int x=1;x<n;x++){
                for (int y=n-1;y>x;y--){
                    System.out.print(" ");
                }
                for (int p=0;p<(2*x)+1;p++){
                    System.out.print("1");
                }
                System.out.println();
            }
        }
    }
}
