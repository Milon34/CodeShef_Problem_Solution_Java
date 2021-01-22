package CodeShef;

import java.util.Scanner;

public class CANDY123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            int i=0,j=0,k=1,count1=0,count2=0;
            for (int in=1;in<Integer.MAX_VALUE;in++){
                if (k%2==0) {
                    count1+=k;
                }else {
                    count2+=k;
                }
                if (count2>a){
                    System.out.println("Bob");
                    break;
                }else if (count1>b){
                    System.out.println("Limak");
                    break;
                }
                k++;
            }
//            while (true){
//                if (k%2==0){
//                    i+=k;
//                }else {
//                    j+=k;
//                }
//                if (i>b){
//                    System.out.println("Limak");
//                    break;
//                }else if (j>a){
//                    System.out.println("Bob");
//                    break;
//                }
//                k++;
//            }
        }
    }
}
