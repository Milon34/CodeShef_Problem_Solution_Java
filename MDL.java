package CodeShef;

import java.util.Arrays;
import java.util.Scanner;

public class MDL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int checkArray[]=new int[n];
            for (int i=0;i<n;i++){
                checkArray[i]=arr[i];
            }
            Arrays.sort(checkArray);
            int a=checkArray[0];
            int b=checkArray[arr.length-1];
            for (int i=0;i<arr.length;i++){
               if (arr[i]==a||arr[i]==b){
                   System.out.print(arr[i]+" ");
               }
            }
            System.out.println();
        }
    }
}
