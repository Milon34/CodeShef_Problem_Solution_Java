package CodeShef;

import java.util.Scanner;

public class FRUITS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while ( t-- >0){
            int m,k,n;
            m=sc.nextInt();//3 4 1
                           //5 2 1
                           //3 4 3
            n=sc.nextInt();
            k=sc.nextInt();
            int check1=m,check2=n;
            for (int i=0;i<k;i++){

                if (m<n){
                    m++;
                }else if (m>n){
                    n++;
                }else {
                    break;
                }
//                if (check1<check2){
//                    check1++;
//                    if (check1==check2){
//                        break;
//                    }
//                }else {
//                    check2++;
//                    if (check1==check2){
//                        break;
//                    }
                }
            System.out.println(Math.abs(n-m));
            }

        }
    }

