package CodeShef;

import java.util.Scanner;

public class MISSP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n=sc.nextInt();
            long arr[]=new long[(int) n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                long count=0;
                for (int j=0;j<n;j++){
                    if (arr[i]==arr[j]){
                        count++;
                    }
                }
                if (count%2!=0){
                    System.out.println(arr[i]);
                    break;
                }
            }

        }
    }
}
