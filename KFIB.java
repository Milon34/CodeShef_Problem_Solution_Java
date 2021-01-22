package CodeShef;

import java.util.Scanner;

public class KFIB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if (n<=k){
            System.out.println(1);
        }else if (n==k+1){
            System.out.println(k);
        }else {
            long ans=k,myValue = 0,helloValue;
            long arr[]=new long[k];
            for (int i=0;i<k;i++){
                arr[i]=1;
            }
            for (int j=0;j<n-k-1;j++){
                helloValue=ans;
                ans=ans-arr[(int) myValue];
                arr[(int) myValue]=helloValue;
                myValue=(myValue+1)%k;
                ans=(ans+helloValue)%1000000007;
            }
            System.out.println(ans);
        }
    }
}
