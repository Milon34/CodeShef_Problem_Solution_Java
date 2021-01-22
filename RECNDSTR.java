package CodeShef;

import java.util.Scanner;

public class RECNDSTR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            String s=sc.next();
            String myString1,myString2;
            myString1=s.substring(1,s.length());
            myString1+=s.charAt(0);
            myString2= String.valueOf(s.charAt(s.length()-1));
            myString2+=s.substring(0,s.length()-1);
            if (myString1.equals(myString2)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
