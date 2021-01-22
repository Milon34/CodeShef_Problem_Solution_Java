package CodeShef;

import java.util.Scanner;

public class FLOW004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            char ch[]=sc.next().toCharArray();
            System.out.println((ch[0]-48)+(ch[ch.length-1]-48));

        }
    }
}
