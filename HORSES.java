package CodeShef;

import java.util.Arrays;
import java.util.Scanner;

public class HORSES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n=sc.nextLong();
            long arr[]=new long[(int) n];
            for (long i=0;i<n;i++){
                arr[(int) i]=sc.nextLong();
            }
            Arrays.sort(arr);
            long min=Integer.MAX_VALUE;
            for (int i=0;i<arr.length-1;i++){
                min=Math.min(min,Math.abs(arr[i]-arr[i+1]));
            }
            System.out.println(min);
        }
    }
}
