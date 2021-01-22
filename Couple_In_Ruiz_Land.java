package CodeShef;

import java.util.Scanner;

public class Couple_In_Ruiz_Land {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print((arr[i]^n)+" ");
        }
        System.out.println();

    }
}
