package CodeShef;

import java.util.Scanner;

public class BRLADDER {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a<b) {
                if (a % 2 != 0) {
                    if ((a + 1) == b || (a + 2) == b) {
                        System.out.println("YES");
                    }else {
                        System.out.println("NO");
                    }
                }else {
                    if ((a+2)==b||(a-1)==b||(a-2)==b){
                        System.out.println("YES");
                    }else {
                        System.out.println("NO");
                    }
                }
            }else if (a>b){
                if (a%2!=0){
                    if ((a-2)==b||(a+2)==b||(a+1)==b){
                        System.out.println("YES");
                    }else {
                        System.out.println("NO");
                    }
                }else {
                    if ((a+2)==b||(a-2)==b||(a-1)==b){
                        System.out.println("YES");
                    }else {
                        System.out.println("NO");
                    }
                }
            }else {
                System.out.println("No");
            }
//           arr1[i]=sc.nextInt();
//           arr2[i]=sc.nextInt();
        }
//          for (int i=0;i<n;i++){
//              if (arr1[i]<arr2[i]){
//                  for ()
//              }
//          }
    }
}
