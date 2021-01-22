package CodeShef;

import java.util.Scanner;

public class ICL1902 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int num=sc.nextInt();
            int root=Integer.MIN_VALUE,count=0;
            while (num>0){
                root= (int) Math.sqrt(num);
                num-=(root*root);
                count++;
            }
            System.out.println(count);
        }
    }
}
