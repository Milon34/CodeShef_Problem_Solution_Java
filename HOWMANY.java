package CodeShef;

import java.util.Scanner;

public class HOWMANY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch[]=sc.next().toCharArray();
        if (ch.length<=3) {
            System.out.println(ch.length);
        }else {
            System.out.println("More than 3 digits");
        }
    }
}
