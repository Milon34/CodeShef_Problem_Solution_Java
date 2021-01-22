package CodeShef;

import java.util.Scanner;

public class RNDPAIR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=0,sum=0,count=0;
            for (int i=0;i<n-1;i++){
                for (int j=i+1;j<n;j++){
                    sum=arr[i]+arr[j];
                    if (sum>max){
                        max=sum;
                        count=1;
                    }else if (sum==max){
                        count++;
                    }
                }
            }
            int myValue=n*(n-1)/2;
            double flag=(double) count/myValue;
            System.out.printf("%.8f\n",flag);
        }
    }
}
