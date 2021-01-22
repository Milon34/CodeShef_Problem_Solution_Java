package CodeShef;

import java.util.Scanner;

public class MSNSADM1 {
    public static int maxValue(int[] arr) {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
//        System.out.println(max);
    }
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            for (int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            int fArray[]=new int[n];
             for (int i=0;i<n;i++){
                 fArray[i]=20*arr1[i];
             }
             int myArray[]=new int[n];
             for (int i=0;i<n;i++){
                 myArray[i]=fArray[i]-(10*arr2[i]);
             }
             int value=maxValue(myArray);
             if (value>0) {
                 System.out.println(value);
             }else {
                 System.out.println(0);
             }
//             int index=0;
//             for (int i=0;i<n;i++){
//                 if (value==myArray[i]){
//                     index=i;
//                 }
//             }
//            System.out.println(value);

        }
    }
}
