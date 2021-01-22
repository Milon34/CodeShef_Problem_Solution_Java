package CodeShef;

import java.util.Arrays;
import java.util.Scanner;

public class MNMX {
    public static long minValue(long[] arr) {
        int i;
        long min = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while ( t-- >0){
            long n=sc.nextInt();
            long arr[]=new long[(int) n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long value=minValue(arr);
            long count=0;
            for (int i=0;i<n-1;i++){
              count++;
            }
            System.out.println(value*count);
        }
    }
}
