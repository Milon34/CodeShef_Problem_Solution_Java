package CodeShef;

import java.util.Scanner;

public class ITGUY48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
          int n=sc.nextInt();
          for (int i=1;i<=n;i++){
              for (int j=1;j<=n;j++){
                  System.out.print(i*j);
              }

              System.out.println();
          }
        }
    }
}
