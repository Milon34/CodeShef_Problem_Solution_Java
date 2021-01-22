package CodeShef;

import java.util.Scanner;

public class VOWELTB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if (s.equals("A")||s.equals("E")||s.equals("I")||s.equals("O")||s.equals("U")){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}
