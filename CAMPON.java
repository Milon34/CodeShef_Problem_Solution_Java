package CodeShef;

import java.util.Scanner;

public class CAMPON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int a[]=new int[32];
            int d,p=0,sum=0,req,day,q,i;
            while(n-->0) {
               d=sc.nextInt();
               p=sc.nextInt();
                a[d]+=p;
            }
            q=sc.nextInt();
            while(q-->0)  {
               day=sc.nextInt();
               req=sc.nextInt();
                sum=0;
                for(i=0;i<day;i++) {
                    sum=sum+a[i];
                }
                if(sum<req) {
                    System.out.println("Go Sleep");
                }
                else {
                    System.out.println("Go Camp");
                }
            }
        }
    }
}
