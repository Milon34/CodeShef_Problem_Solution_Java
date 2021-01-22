package CodeShef;

import java.util.Scanner;

public class FRGTNLNG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            String[] s=new String[n];
           for (int i=0;i<n;i++){
               s[i]=sc.next();
           }
            String desS=" ";
              for (int i=0;i<k;i++){
                  int val=sc.nextInt();
                  while (val-->0) {
                      desS += sc.next();
                  }

              }
            System.out.println(desS);
              for (int i=0;i<n;i++){
                  if (desS.contains(s[i])){
                      System.out.print("YES"+" ");
                  }else {
                      System.out.print("NO"+" ");
                  }
              }
            System.out.println();


          }



        }
    }

