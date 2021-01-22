package CodeShef;

import java.util.Scanner;

public class ITGUY63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = 1, count = 0;
            for (int x = n; x > 0; x--) {
                 m = 1;count= 0;
                for (int y = n; y > x; y--) {
                    System.out.print(" ");
                    count++;
                }
                for (int p = 0; p < (2 * x) - 1; p++) {
                    System.out.print(m + count);
                }
                System.out.println();
            }
           int v=m+count+1;
            for (int x = 1; x < n; x++) {
                for (int y = n - 1; y > x; y--) {
                    System.out.print(" ");
                }
                for (int p = 0; p < (2 * x) + 1; p++) {
                    System.out.print(v);
                }
                v++;
                System.out.println();
            }
        }
    }
}
