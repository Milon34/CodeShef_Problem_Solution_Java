package CodeShef;

import java.util.Scanner;

public class MATCHES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a,b,sum=0;
            a=sc.nextInt();
            b=sc.nextInt();
            sum=a+b;
            int matchSum=0;
            int arr[]={6,2,5,5,4,5,6,3,7,6};
            while (sum!=0){
                matchSum+=arr[sum%10];
                sum/=10;
            }
            System.out.println(matchSum);
        }
    }
}
