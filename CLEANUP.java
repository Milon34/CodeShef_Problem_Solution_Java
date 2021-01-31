package CodeShef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CLEANUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                l.add(i);
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                if (l.contains(a)) {
                    l.remove(new Integer(a));
                }
            }
            for (int i = 0; i < n - m; i += 2) {
                System.out.print(l.get(i) + " ");
            }
            System.out.println();
            for (int i = 1; i < n - m; i += 2) {
                System.out.print(l.get(i) + " ");
            }
            System.out.println();
        }
    }
}

class BinarySearch2 {
    static int binarySearch(int arr[], int N, int X) {
        int start = 0;
        int end = N;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (X == arr[mid]) {
                return 1;
            } else if (X < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int N = arr.length;
        int X = 30;
        System.out.println(binarySearch(arr, N, X));
    }
}