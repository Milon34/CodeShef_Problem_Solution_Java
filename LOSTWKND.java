package CodeShef;

import java.util.Scanner;

public class LOSTWKND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int arr[] = new int[6];
            for (int i = 0; i < 6; i++) {
                arr[i] = sc.nextInt();
            }
            float sum=0;
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i] * arr[arr.length - 1];
                sum+=arr[i];
            }
            if (sum<=120){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }

        }
    }
}
