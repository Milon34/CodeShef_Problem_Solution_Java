package CodeShef;

import java.util.Arrays;
import java.util.Scanner;

public class EXUNA {
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
           // long ans=arr[0]%arr[1];
            if (arr[0]==arr[1]){
                System.out.println(0);
            }else {
                System.out.println(arr[0]%arr[1]);
            }
//
//            for (int i=2;i<n;i++){
//               ans=ans%arr[i];
//            }
//            System.out.println(ans);
        }
    }
}
