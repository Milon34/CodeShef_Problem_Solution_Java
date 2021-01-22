package CodeShef;

import java.util.HashSet;
import java.util.Scanner;

public class CHNGIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0,max=0;
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr.length;j++){
                    if (arr[i]==arr[j]){
                        count++;
                    }
                }
                if (max==0){
                    max=count;
                }
                if (count==n){
                    break;
                }else if (count>max){
                    max=count;
                }
                count=0;
            }
            System.out.println(n-max);
        }
    }
}
class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int  i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for (int i=0;i<n;i++){
            arr[i]=max+arr[i];
            max=arr[i];
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
//        int sumArray[]=new int[n];
//        sumArray[0]=0;
//        for (int i=1;i<n;i++){
//            sumArray[i]=sumArray[i-1]+arr[i];
//        }
//        for (int i:sumArray){
//            System.out.print(i+" ");
//        }
    }
}