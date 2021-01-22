package CodeShef;

import java.util.Scanner;

public class CFEST001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        while (n-- >0){
            String s=sc.next();
            char ch[]=s.toCharArray();
            max=Math.max(max,ch.length);
        }
        System.out.println(max);
    }
}
