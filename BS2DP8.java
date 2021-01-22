package CodeShef;

import java.util.Arrays;
import java.util.Scanner;

public class BS2DP8 {
    public static int minValue(int[] arr) {
        int i;
        int min = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, w;
        n = sc.nextInt();
        m = sc.nextInt();
        w = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min=minValue(arr);
        if (m < w) {
            for (int i = 0; i < m-1; i++) {
                arr[i] += 1;
                min += 1;
                if (maxValue(arr) >= w) {
                    break;
                }
            }
        }
//        } else {
//            for (int i = 0; i < m; i++) {
//                arr[i] += 1;
//                if (maxValue(arr) >= w) {
//                    break;
//                }
//            }
//        }
        System.out.println(min);
    }
}
