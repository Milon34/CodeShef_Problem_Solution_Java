package CodeShef;

import java.util.Scanner;

public class DWNLD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int costValue=0;
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            for (int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
                arr2[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                if (arr1[i]<k){
                    k=k-arr1[i];
                }else {
                    costValue=costValue+(arr1[i]-k)*arr2[i];
                    k=0;
                }
            }
            System.out.println(costValue);
        }
    }
}
