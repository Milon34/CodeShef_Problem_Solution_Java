package CodeShef;

import java.util.Scanner;

public class ITGUY46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int sum=0;
            for (int i=1;i<=n;i++){
                sum+=i*i;
            }
            for (int i=n-1;i>=1;i--){
                sum+=i*i;
            }
            System.out.println(sum);
        }
    }
}
