package CodeShef;

import java.util.Scanner;

public class CIN011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int ans=0,max=Integer.MIN_VALUE;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                ans+=a;
                max=Math.max(max,ans);
                max=Math.max(max,a);
                if (ans<0){
                    ans=0;
                }
            }
            System.out.println(max);
        }
    }
}
