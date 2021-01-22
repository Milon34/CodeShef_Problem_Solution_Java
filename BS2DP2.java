package CodeShef;

import java.util.Scanner;

public class BS2DP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        int check=0;
        int max=0;
        for (int i = 0; i < n; i++) {
            if (arr[check]==0||i==0){

            }else {
                if (arr[check] % i == 0) {
                    sum += arr[check];
                    max=Math.max(max,sum);
                }
            }
            check++;
        }
        System.out.println(sum);
    }
}


class testF {
    public static void main(String[] args) {
        //System.out.println(0%0);
    }
}