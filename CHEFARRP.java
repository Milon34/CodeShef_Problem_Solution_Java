package CodeShef;

import java.util.Scanner;

public class CHEFARRP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long count=0;
            for (int i=0;i<n;i++){
                long product=1,sum=0;
                for (int j=i;j<n;j++){
                    product*=arr[j];
                    sum+=arr[j];
                    if (product==sum){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
