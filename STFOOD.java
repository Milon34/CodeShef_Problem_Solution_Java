package CodeShef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class STFOOD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int a,b,c,max=0;
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                l.add((int) Math.floor(b/(a+1)*c));
               // max=Math.max(max,(c/(a+1))*b);
            }
            int value=Collections.max(l);
            //int ab= (int) Math.floor(value);
            System.out.println(value);

        }
    }
}
