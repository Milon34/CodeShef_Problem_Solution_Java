package CodeShef;

import java.util.Scanner;

public class RAINBOWA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int l = 0; l < t; l++) {
            int n = scan.nextInt();
            int[] x = new int[n];
            boolean available = false;
            for (int i = 0; i < x.length; i++) {
                x[i] = scan.nextInt();
                if (x[i] > 7)
                    available = true;
            }
            System.out.println(check(x, available));
        }
    }

    public static String check(int[] x, boolean available) {
        if (available) {
            return "no";
        }
        int low = 0, high = x.length - 1, value = 0;
        while (low <= high) {
            if (x[low] == x[high]) {
                if (x[low] == value || x[low] == value + 1) {
                    value = x[low];
                    low++;
                    high--;
                } else {
                    return "no";
                }
            } else {
                return "no";
            }
        }
        if (value < 7)
            return "no";
        return "yes";
    }
}
