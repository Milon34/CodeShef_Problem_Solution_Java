package CodeShef;

import java.util.Scanner;

public class BITOBYT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--  >0){
            int n=sc.nextInt();
            int a,r;
            a=n/26;
            r=n%26;
            if (r>0&&r<3){
                System.out.println((int) Math.pow(2,a)+" "+0+" "+0);
            }else if (r>2&&r<11){
                System.out.println(0+" "+(int) Math.pow(2,a)+" "+0);
            }else if (r==0){
                System.out.println(0+" "+0+" "+(int) Math.pow(2,a-1));
            }else {
                System.out.println(0+" "+0+" "+(int) Math.pow(2,a));
            }
        }
    }
}
