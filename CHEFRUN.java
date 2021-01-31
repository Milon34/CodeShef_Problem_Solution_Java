package CodeShef;

import java.util.Scanner;

public class CHEFRUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x1, x2, x3, v1, v2;
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            x3 = sc.nextInt();
            v1 = sc.nextInt();
            v2 = sc.nextInt();
            float chefValue = (float) (Math.abs(x3 - x1)) / v1;
            float kefaValue = (float) (Math.abs(x3 - x2)) / v2;
            if (chefValue < kefaValue) {
                System.out.println("Chef");
            } else if (chefValue > kefaValue) {
                System.out.println("Kefa");
            } else {
                System.out.println("Draw");

            }
        }
    }
}
