package CodeShef;

import java.util.Scanner;

public class ELEVSTRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, v1, v2;
            n = sc.nextInt();
            v1 = sc.nextInt();
            v2 = sc.nextInt();
            float value1 = (float) (2 * n) / v2;
            float value2 = (float) (Math.sqrt(2) * n) / v1;
            if (value1 < value2) {
                System.out.println("Elevator");
            } else {
                System.out.println("Stairs");
            }
        }
    }
}
