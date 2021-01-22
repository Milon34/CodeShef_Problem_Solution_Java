package CodeShef;

import java.util.Scanner;

public class RRJOKE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            for (int i=1;i<=2*n;i++){
                int x;
                x=sc.nextInt();
            }
            int ans=0;
            for (int i=1;i<=n;i++){
                ans^=i;
            }
            System.out.println(ans);
        }
    }
}
