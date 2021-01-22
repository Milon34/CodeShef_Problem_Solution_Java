package CodeShef;

import java.util.Scanner;

public class CHEGLOVE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arrL[]=new int[n];
            int arrR[]=new int[n];
            for (int i=0;i<n;i++){
                arrL[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                arrR[i]=sc.nextInt();
            }
            int front=0,back=0;
            for (int i=0;i<n;i++){
                if(arrL[i]<=arrR[i])
                {
                    front++;
                }
                if(arrL[i]<=arrR[n-1-i])
                {
                    back++;
                }
            }

            if(front==n && back!=n)
            {
                System.out.println("front");
            }
            if(back==n && front!=n)
            {
                System.out.println("back");
            }
            if(front==n && back ==n)
            {
                System.out.println("both");
            }
            if(front!=n && back !=n)
            {
                System.out.println("none");
            }

//            if (countBig==n){
//                System.out.println("front");
//            }else if (countEqual==n){
//                System.out.println("both");
//            }else if (countSmall==countBig&&countBig==countEqual){
//                System.out.println("back");
//            }else if (countBig>countSmall&&countBig>countEqual){
//                System.out.println("none");
//            }
        }
    }
}
