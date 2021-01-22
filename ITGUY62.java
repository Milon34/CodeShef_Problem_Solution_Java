package CodeShef;

import java.util.Scanner;

public class ITGUY62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int x = n; x > 0; x--) {
                int count=0;
                for (int y=n;y>x;y--) {
                    System.out.print(" ");
                    count++;
                }
                for (int p=1;p<=(2*x)-1;p++){
                    System.out.print(count+p);
                }
                System.out.println();
            }
            //int m=0;
            for (int x=1;x<n;x++){
                int count=0;
                for (int y=n-1;y>x;y--){
                    System.out.print(" ");
                    count++;
                }
                for (int p=1;p<=(2*x)+1;p++){
                    System.out.print(count+p);
                }
                //m++;
                System.out.println();
            }


        }
    }
}
