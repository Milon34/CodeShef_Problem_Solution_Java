package CodeShef;

import java.util.Scanner;

public class PALIN {
    public  static boolean isPalin(int value){
        int  r,sum=0,temp;
        temp=value;
        while(value>0){
            r=value%10;
            sum=(sum*10)+r;
            value=value/10;
        }
        if (temp==sum){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int value=sc.nextInt();
           milon: for (int i=value+1;i<Integer.MAX_VALUE;i++){
                int palinValue=i;
                if (isPalin(i)){
                    System.out.println(palinValue);
                    break;
                }else {
                    continue milon;
                }
            }
        }
    }
}
