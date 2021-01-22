package CodeShef;

import java.util.Scanner;

public class ATM2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                if (arr[i]<=k){
                    k=k-arr[i];
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }

        }
    }
}
