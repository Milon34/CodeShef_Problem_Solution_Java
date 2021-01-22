package CodeShef;

import java.util.Arrays;
import java.util.Scanner;

public class EID {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int min=Integer.MAX_VALUE;
            for (int i=0;i<n-1;i++){
                min=Math.min(min,Math.abs(arr[i]-arr[i+1]));
//                for (int j=i+1;j<n;j++){
//                    min=Math.min(min,Math.abs(arr[i]-arr[j]));
//                }
            }
            System.out.println(min);
        }

    }
}
