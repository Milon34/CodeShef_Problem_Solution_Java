package CodeShef;

import java.util.Scanner;

public class XOR_Sums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int q=sc.nextInt();
        int arr1[]=new int[q];
        for (int i=0;i<q;i++){
            arr1[i]=sc.nextInt();
        }
        int xorSum=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                 xorSum+=arr[i]^arr[j];
            }
        }
        System.out.println(sum);
        System.out.println(sum+xorSum);

    }
}
